package AWT;

import java.awt.*;
import java.awt.event.*;

public class MyChoiceMenu extends Frame implements ItemListener, ActionListener {
    String msg;
    Choice ch;
    TextField tf;

    MyChoiceMenu(){
        setLayout(new FlowLayout());
        tf = new TextField(10);
        tf.addActionListener(this);
        ch = new Choice();
        ch.add("English");
        ch.add("Hindi");
        ch.add("Telugu");
        ch.add("Tamil");
        add(tf);
        add(ch);

        ch.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent itemEvent) {

        repaint();

    }

    public void paint(Graphics g){
        g.drawString("Selected Language:",10,100);
        msg = ch.getSelectedItem();
        g.drawString(msg,10,120);
    }
    public static void main(String[] args){
        MyChoiceMenu mc = new MyChoiceMenu();
        mc.setTitle("Menu");
        mc.setSize(400,400);
        mc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(!tf.getText().isEmpty()&&!textCompare(tf.getText())){
            ch.add(tf.getText());
            tf.setText("");
        }
    }
    public boolean textCompare(String str){
        boolean found = false;

        for (int i=0;i<ch.getItemCount();i++){
            if(str.equalsIgnoreCase(ch.getItem(i))){
                found = true;
            }
        }
        return found;
    }
}
