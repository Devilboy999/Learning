package swing;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(){
        this.setBackground(Color.green);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica", Font.BOLD,34));
        g.drawString("Hello World!!!",50,100);
    }
}
