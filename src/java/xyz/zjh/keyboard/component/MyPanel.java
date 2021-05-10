package xyz.zjh.keyboard.component;

import javax.swing.*;
import java.awt.*;

/**
 * @Classname MyPanel
 * @Description TODO
 * @Date 2021/5/10 12:38
 * @Author zjhchester
 */
public class MyPanel extends JPanel {
    private static final long serialVersionUID = -6352788025440244338L;

    private Image image;
    private Integer index = 1;
    public MyPanel() {
        this.image = new ImageIcon(getClass().getResource("img/1.gif")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    public void reloadImg(){
        if(index==18){
            index = 1;
        }
        this.image =  new ImageIcon(getClass().getResource(String.format("img/%s.gif",index))).getImage();
        repaint();
        index++;
    }
}
