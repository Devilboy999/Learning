package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MyTableGetter extends JFrame implements ActionListener {
    JTextField name,desig,sal;
    JButton retData;
    MyTable mt;
    MyTableGetter(MyTable mt){
        this.mt=mt;
        JLabel n,d,s;
        n = new JLabel("Enter Name of Employee");
        d = new JLabel("Enter Designation of Employee");
        s = new JLabel("Enter Salary of Employee");
        name = new JTextField();
        desig = new JTextField();
        sal = new JTextField();
        name.setColumns(20);
        desig.setColumns(20);
        sal.setColumns(20);
        retData = new JButton("Submit");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(n);
        c.add(name);
        c.add(d);
        c.add(desig);
        c.add(s);
        c.add(sal);
        c.add(retData);
        retData.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Vector<String> row = new Vector<>();
        row.add(name.getText());
        row.add(desig.getText());
        row.add(sal.getText());
        mt.setTableData(row);
        this.dispose();
    }
}
