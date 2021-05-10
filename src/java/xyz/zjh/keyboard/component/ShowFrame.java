package xyz.zjh.keyboard.component;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Classname ShowFrame
 * @Description 显示面板
 * @Date 2021/5/9 14:09
 * @Author zjhchester
 */
public class ShowFrame extends JFrame {
    private List<JTextField> wordList = new ArrayList<>();
    private CopyOnWriteArrayList<String> box = new CopyOnWriteArrayList<>();
    private MyPanel cat;
    private ShowFrame() throws HeadlessException {
        super("猫咪指令捕捉v3.0\t\t\t\t\t power by @zjhChester");
        initComponent();
        initSetting();
        addNativeKeyListener();

    }
    private void initComponent() {
        setRow1();
        setRow2();
        setRow3();
        setRow4();
        setRow5();
        setRow6();
        cat = new MyPanel();
        cat.setBounds(0,0,500,130);
    }

    private void setRow6() {
        setWordsByPositionAndName(0,5,30,"Ctrl");
        setWordsByPositionAndName(1,5,35,"Meta");
        setWordsByPositionAndName(3,5,25,"Alt");
        setWordsByPositionAndName(4,5,125,"空格");
        setWordsByPositionAndName(9,5,25,"Alt");
        setWordsByPositionAndName(10,5,55,"上下文菜单");
        setWordsByPositionAndName(13,5,30,"Ctrl");
        setWordsByPositionAndName(16,5,25,"向左箭头");
        setWordsByPositionAndName(17,5,25,"向下箭头");
        setWordsByPositionAndName(18,5,25,"向右箭头");
    }

    private void setRow5() {
        setWordsByPositionAndName(0,4,50,"Shift");
        setWordsByPositionAndName(2,4,25,"Z");
        setWordsByPositionAndName(3,4,25,"X");
        setWordsByPositionAndName(4,4,25,"C");
        setWordsByPositionAndName(5,4,25,"V");
        setWordsByPositionAndName(6,4,25,"B");
        setWordsByPositionAndName(7,4,25,"N");
        setWordsByPositionAndName(8,4,25,"M");
        setWordsByPositionAndName(9,4,25,"逗号");
        setWordsByPositionAndName(10,4,25,"句点");
        setWordsByPositionAndName(11,4,25,"斜杠");
        setWordsByPositionAndName(12,4,50,"未知 keyCode: 0xe36");
        setWordsByPositionAndName(17,4,25,"向上箭头");
    }

    private void setRow4() {
        setWordsByPositionAndName(0,3,32,"Caps Lock");
        setWordsByPositionAndName(1,3,25,"A");
        setWordsByPositionAndName(2,3,25,"S");
        setWordsByPositionAndName(3,3,25,"D");
        setWordsByPositionAndName(4,3,25,"F");
        setWordsByPositionAndName(5,3,25,"G");
        setWordsByPositionAndName(6,3,25,"H");
        setWordsByPositionAndName(7,3,25,"J");
        setWordsByPositionAndName(8,3,25,"K");
        setWordsByPositionAndName(9,3,25,"L");
        setWordsByPositionAndName(10,3,25,"分号");
        setWordsByPositionAndName(11,3,25,"引号");
        setWordsByPositionAndName(13,3,45,"Enter");
    }

    private void setRow3() {
        setWordsByPositionAndName(0,2,25,"Tab");
        setWordsByPositionAndName(1,2,25,"Q");
        setWordsByPositionAndName(2,2,25,"W");
        setWordsByPositionAndName(3,2,25,"E");
        setWordsByPositionAndName(4,2,25,"R");
        setWordsByPositionAndName(5,2,25,"T");
        setWordsByPositionAndName(6,2,25,"Y");
        setWordsByPositionAndName(7,2,25,"U");
        setWordsByPositionAndName(8,2,25,"I");
        setWordsByPositionAndName(9,2,25,"O");
        setWordsByPositionAndName(10,2,25,"P");
        setWordsByPositionAndName(11,2,25,"左方括号");
        setWordsByPositionAndName(12,2,25,"右方括号");
        setWordsByPositionAndName(13,2,25,"反斜杠");
        setWordsByPositionAndName(16,2,25,"Delete");
        setWordsByPositionAndName(17,2,25,"End");
        setWordsByPositionAndName(18,2,25,"Page Down");
    }

    private void setRow2() {
        setWordsByPositionAndName(0,1,25,"后引号");
        setWordsByPositionAndName(1,1,25,"1");
        setWordsByPositionAndName(2,1,25,"2");
        setWordsByPositionAndName(3,1,25,"3");
        setWordsByPositionAndName(4,1,25,"4");
        setWordsByPositionAndName(5,1,25,"5");
        setWordsByPositionAndName(6,1,25,"6");
        setWordsByPositionAndName(7,1,25,"7");
        setWordsByPositionAndName(8,1,25,"8");
        setWordsByPositionAndName(9,1,25,"9");
        setWordsByPositionAndName(10,1,25,"0");
        setWordsByPositionAndName(11,1,25,"减号");
        setWordsByPositionAndName(12,1,25,"等号");
        setWordsByPositionAndName(13,1,68,"Backspace");
        setWordsByPositionAndName(16,1,25,"Insert");
        setWordsByPositionAndName(17,1,25,"Home");
        setWordsByPositionAndName(18,1,25,"Page Up");
    }

    private void setRow1() {
        setWordsByPositionAndName(0,0,25,"Esc");
        setWordsByPositionAndName(1,0,25,"F1");
        setWordsByPositionAndName(2,0,25,"F2");
        setWordsByPositionAndName(3,0,25,"F3");
        setWordsByPositionAndName(4,0,25,"F4");
        setWordsByPositionAndName(6,0,25,"F5");
        setWordsByPositionAndName(7,0,25,"F6");
        setWordsByPositionAndName(8,0,25,"F7");
        setWordsByPositionAndName(9,0,25,"F8");
        setWordsByPositionAndName(11,0,25,"F9");
        setWordsByPositionAndName(12,0,25,"F10");
        setWordsByPositionAndName(13,0,25,"F11");
        setWordsByPositionAndName(14,0,25,"F12");
        setWordsByPositionAndName(16,0,25,"Print Screen");
        setWordsByPositionAndName(17,0,25,"Scroll Lock");
        setWordsByPositionAndName(18,0,25,"Pause");
    }

    private void setWordsByPositionAndName(int x,int y,int width,String name) {
        JTextField jTextField = new JTextField();
        jTextField.setEnabled(false);
        jTextField.setBounds(x==0?0:(x*25)+10,y==0?30+100:((y+1)*30)+100, width, 30);
        jTextField.setBackground(Color.white);
        jTextField.setDisabledTextColor(Color.black);
        jTextField.setFont(new Font("楷体", Font.BOLD, 11));
        jTextField.setName(name);
        name = fixTextIntoKeyBoard(name);
        jTextField.setText(name);
        this.wordList.add(jTextField);
    }

    private String fixTextIntoKeyBoard(String name) {
        name ="Print Screen".equals(name)?"PS":name;
        name ="Scroll Lock".equals(name)?"SL":name;
        name ="Pause".equals(name)?"PB":name;
        name ="Insert".equals(name)?"INS":name;
        name ="Home".equals(name)?"HM":name;
        name ="Page Up".equals(name)?"PU":name;
        name ="后引号".equals(name)?"~":name;
        name ="Page Down".equals(name)?"PD":name;
        name ="Delete".equals(name)?"DEL":name;
        name ="左方括号".equals(name)?"[":name;
        name ="右方括号".equals(name)?"]":name;
        name ="反斜杠".equals(name)?"\\":name;
        name ="分号".equals(name)?";":name;
        name ="引号".equals(name)?"'":name;
        name ="未知 keyCode: 0xe36".equals(name)?"shift":name;
        name ="斜杠".equals(name)?"/":name;
        name ="句点".equals(name)?".":name;
        name ="逗号".equals(name)?",":name;
        name ="向上箭头".equals(name)?"↑":name;
        name ="向下箭头".equals(name)?"↓":name;
        name ="向左箭头".equals(name)?"←":name;
        name ="向右箭头".equals(name)?"→":name;
        name ="上下文菜单".equals(name)?"context":name;
        name ="减号".equals(name)?"-":name;
        name ="等号".equals(name)?"=":name;
        return name;
    }

    private void initSetting() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        for (JTextField jTextField : this.wordList) {
            contentPane.add(jTextField);
        }
        contentPane.add(this.cat);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 345);
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setResizable(false);
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
            public void nativeKeyTyped(NativeKeyEvent e) {}

            @Override
            public void nativeKeyPressed(NativeKeyEvent e) {
                if (!ShowFrame.this.box.contains(String.valueOf(e.getKeyCode()))) {
                    ShowFrame.this.box.add(NativeKeyEvent.getKeyText(e.getKeyCode()));
                    if("未知 keyCode: 0xe4a".equals(NativeKeyEvent.getKeyText(e.getKeyCode()))){
                        ShowFrame.this.box.clear();
                    }
                }
                showKey();

            }

            private void showKey() {
                ShowFrame.this.wordList.forEach(v->{
                    if(ShowFrame.this.box.contains(v.getName())){
                        v.setDisabledTextColor(Color.WHITE);
                        v.setBackground(Color.BLACK);
                    }else{
                        v.setDisabledTextColor(Color.BLACK);
                        v.setBackground(Color.WHITE);
                    }
                    ShowFrame.this.cat.reloadImg();
                });
            }

            @Override
            public void nativeKeyReleased(NativeKeyEvent e) {
                ShowFrame.this.box.remove(NativeKeyEvent.getKeyText(e.getKeyCode()));
                showKey();
            }
        });
    }
}
