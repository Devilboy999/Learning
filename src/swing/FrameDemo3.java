package swing;

import javax.swing.*;
import java.awt.*;

public class FrameDemo3 extends JFrame {
    JLabel lbl;
    FrameDemo3(){
        Container c= this.getContentPane();
        c.setLayout(new FlowLayout());
        lbl = new JLabel("Hello World!!!");
        lbl.setFont(new Font("Helvetica",Font.BOLD,34));
        lbl.setForeground(Color.red);
        c.add(lbl);
    }

    public static void main(String[] args){
        FrameDemo3 fd = new FrameDemo3();
        fd.setTitle("Lets see");
        fd.setSize(400,400);
        fd.setVisible(true);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
