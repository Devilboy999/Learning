package swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonToImage extends JFrame implements ActionListener {
    JButton b;
    JLabel lbl;
    boolean imageFlag =false;
    ButtonToImage() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon ii = new ImageIcon("files/javaPic.png");
        Color myColor1 = new Color(238, 217, 151);
        Color myColor2 = new Color(167, 90, 90);
        b = new JButton("Click Me", ii);
        b.setBackground(myColor1);
        b.setForeground(myColor2);
        b.setFont(new Font("Ariel", Font.BOLD, 30));
        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        b.setToolTipText("This is another button");
        b.setMnemonic('C');
        c.add(b);
        b.addActionListener(this);
        lbl = new JLabel();
        c.add(lbl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if(!imageFlag){
        ImageIcon ii = new ImageIcon("files/javaPic.png");
        lbl.setIcon(ii);
            imageFlag =true;
        }
        else{
            lbl.setIcon(null);
            imageFlag =false;
        }
    }

    public static void main(String[] args){
        ButtonToImage bti = new ButtonToImage();
        bti.setSize(500,500);
        bti.setLocationRelativeTo(null);
        bti.setResizable(false);
        bti.setVisible(true);
    }
}
