package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends Frame implements ActionListener {
    Button back;

    Frame2(){
        setLayout(new FlowLayout());
        back = new Button("Back");
        add(back);
        back.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Frame1 f1 = new Frame1();
        f1.setTitle("First Frame");
        f1.setSize(400,400);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        this.dispose();
    }
}
