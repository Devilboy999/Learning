package swing;

import javax.swing.*;
import java.awt.*;

public class FrameDemo2 extends JFrame {
    FrameDemo2(){
        Container c = this.getContentPane();
        MyPanel mp = new MyPanel();
        c.add(mp);

    }

    public static void main(String[] args){
        FrameDemo2 fd = new FrameDemo2();
        fd.setTitle("First Text");
        fd.setSize(400,400);
        fd.setLocationRelativeTo(null);
        fd.setVisible(true);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
