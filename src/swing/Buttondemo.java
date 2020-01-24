package swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

//No button Actions
public class Buttondemo extends JFrame {
    JButton btn;

    Buttondemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon fi = new ImageIcon("files/javaPic.png");
        btn = new JButton("Click Me", fi);
        btn.setBackground(Color.yellow);
        btn.setForeground(Color.red);
        btn.setFont(new Font("Ariel", Font.BOLD, 30));
        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        btn.setBorder(bd);
        btn.setToolTipText("This is Button Bro");
        btn.setMnemonic('c');
        c.add(btn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Buttondemo obj = new Buttondemo();
        obj.setSize(600,400);
        obj.setTitle("ButtonDemo");
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setVisible(true);

    }

}
