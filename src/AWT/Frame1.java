package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 extends Frame implements ActionListener {
    Button next,close;
    Frame1(){
        setLayout(new FlowLayout());
        next = new Button("Next");
        close = new Button("Close");
        add(next);
        add(close);
        next.addActionListener(this);
        close.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Next")){
            Frame2 f2= new Frame2();
            f2.setSize(400,400);
            f2.setVisible(true);
            f2.setLocationRelativeTo(null);
            f2.setResizable(false);
            this.dispose();

        }
        if(ae.getActionCommand().equals("Close")){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        Frame1 f1 = new Frame1();
        f1.setTitle("First Frame");
        f1.setSize(400,400);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}
