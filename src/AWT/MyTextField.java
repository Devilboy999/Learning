package AWT;

import java.awt.*;
import java.awt.event.*;

public class MyTextField extends Frame implements ActionListener {

    TextField name,password;

    MyTextField(){
        setLayout(new FlowLayout());
        Label n = new Label("Name: ",Label.LEFT);
        Label p = new Label("Password: ",Label.LEFT);

        name = new TextField(20);
        password = new TextField(20);
        password.setEchoChar('*');
        name.setBackground(Color.yellow);
        name.setForeground(Color.red);
        Font f = new Font("Arial",Font.PLAIN,25);
        name.setFont(f);
        add(n);
        add(name);
        add(p);
        add(password);
        name.addActionListener(this);
        password.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Graphics g= this.getGraphics();
        g.clearRect(0,0,getWidth(),getHeight());
        if(!(name.getText().isEmpty()||password.getText().isEmpty())){

        g.drawString("Name: "+ name.getText(),10,50);
        g.drawString("Password: "+ password.getText(),10,90);

        }
        else{

            g.drawString("Please fill Name and Password fields",10,150);
        }
    }

    public static void main(String[] args){
        MyTextField mt = new MyTextField();
        mt.setTitle("My field");
        mt.setSize(400,400);
        mt.setVisible(true);
    }


}
