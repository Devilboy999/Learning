package swing;

import javax.swing.*;
import java.awt.*;

public class SwingFrameDemo {
    public static void main(String[] args){
        JFrame obj = new JFrame();
        Container c= obj.getContentPane();
        c.setBackground(Color.green);
        obj.setSize(400,400);
        obj.setLocationRelativeTo(null);
        obj.setTitle("First Frame");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
