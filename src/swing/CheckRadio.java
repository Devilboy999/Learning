package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class CheckRadio extends JFrame implements ActionListener {

    JCheckBox cb1,cb2;
    JRadioButton rb1,rb2;
    JTextArea ta;
    ButtonGroup bg;
    String msg="";
    CheckRadio(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ta = new JTextArea(10,20);

        cb1 = new JCheckBox("Java", true);
        cb2 = new JCheckBox("Python");

        rb1 = new JRadioButton("Engineer", true);
        rb2 = new JRadioButton("Doctor");

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        c.add(cb1);
        c.add(cb2);
        c.add(rb1);
        c.add(rb2);
        c.add(ta);
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(cb1.getModel().isSelected()||cb2.getModel().isSelected()){
            msg+="Choosen Language:";
        }
        if(cb1.getModel().isSelected()){
            msg+="\nJava";
        }
        if(cb2.getModel().isSelected()){
            msg+="\nPython";
        }
        if(cb1.getModel().isSelected()||cb2.getModel().isSelected()){
            msg+="\n\n";
        }
        if(rb1.getModel().isSelected()){
            msg+="Selected Profession: \nEngineer";
        }
        else
            msg+= "Selected Profession: \nDoctor";
        ta.setText(msg);
        msg="";

    }

    public static void main(String[] args){
        CheckRadio cb = new CheckRadio();
        cb.setTitle("All");
        cb.setSize(500,500);
        cb.setLocationRelativeTo(null);
        cb.setResizable(false);
        cb.setVisible(true);
    }
}
