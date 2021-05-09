package xyz.zjh.keyboard.component;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Classname ShowFrame
 * @Description TODO
 * @Date 2021/5/9 14:09
 * @Author zjhchester
 */
public class ShowFrame extends JFrame {
    private JTextField showKeyboardText;
    private CopyOnWriteArrayList<String> box = new CopyOnWriteArrayList<>();

    private ShowFrame() throws HeadlessException {
        super("键盘监听指令");
        initComponent();
        initSetting();
        addNativeKeyListener();

    }



    private void initComponent() {
        this.showKeyboardText = new JTextField(10);
        this.showKeyboardText.setEnabled(false);
        this.showKeyboardText.setBounds(10, 10, 465, 50);
        this.showKeyboardText.setText("111111111");
        this.showKeyboardText.setBackground(Color.black);
        this.showKeyboardText.setDisabledTextColor(Color.white);
        this.showKeyboardText.setFont(new Font("1", Font.BOLD, 13));
    }

    private void initSetting() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(this.showKeyboardText);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
    }

    public static void start() {
        new ShowFrame();
    }
    private void addNativeKeyListener() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new NativeKeyListener() {
            @Override
            public void nativeKeyTyped(NativeKeyEvent e) {

            }

            @Override
            public void nativeKeyPressed(NativeKeyEvent e) {
                if (!ShowFrame.this.box.contains(String.valueOf(e.getKeyCode()))) {
                    ShowFrame.this.box.add(String.valueOf(e.getKeyCode()));
                }
                StringBuilder sb = new StringBuilder();
                int index = 0;
                for (String s : ShowFrame.this.box) {
                    if (index != 0) {
                        sb.append("+");
                    }
                    sb.append(NativeKeyEvent.getKeyText(Integer.parseInt(s)));
                    index++;
                }
                ShowFrame.this.showKeyboardText.setText(sb.toString());
            }

            @Override
            public void nativeKeyReleased(NativeKeyEvent e) {
                ShowFrame.this.box.remove(String.valueOf(e.getKeyCode()));
                StringBuilder sb = new StringBuilder();
                int index = 0;
                for (String s : ShowFrame.this.box) {
                    if (index != 0) {
                        sb.append("+");
                    }
                    sb.append(NativeKeyEvent.getKeyText(Integer.parseInt(s)));
                    index++;
                }
                ShowFrame.this.showKeyboardText.setText(sb.toString());
            }
        });
    }
}
