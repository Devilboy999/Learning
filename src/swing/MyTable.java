package swing;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MyTable extends JFrame implements ActionListener {
    private JButton addData;
    private Vector<Vector<String>> data = new Vector<>();
    private Container c = getContentPane();
    MyTable() {

        Vector<String> row = new Vector<>();
        row.add("Rama Rao");
        row.add("Analyst");
        row.add("22,000.00");
        data.add(row);
        row = new Vector<>();
        row.add("Srinivas Kumar");
        row.add("Programmer");
        row.add("18,000.50");
        data.add(row);
        row = new Vector<>();
        row.add("Vinaya Devi");
        row.add("Programmer");
        row.add("16,000.75");
        data.add(row);

        Vector<String> cols = new Vector<>();
        cols.add("Employee Name");
        cols.add("Designation");
        cols.add("Salary");
        //Data is a two dimensional array containing data of the table, cols is one dimensional array containing Column Names
        JTable tab = new JTable(data, cols);
        tab.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        tab.setFont(new Font("Arial", Font.BOLD, 20));
        tab.setRowHeight(30);
        tab.setGridColor(Color.red);
        JTableHeader head = tab.getTableHeader();
        addData = new JButton("Add Data");
        addData.addActionListener(this);

        c.setLayout(new BorderLayout());
        c.add("North", head);
        c.add("Center", tab);
        c.add("South", addData);


    }

    public static void main(String[] args) {
        MyTable mt = new MyTable();
        mt.setSize(500, 400);
        mt.setVisible(true);
        mt.setLocationRelativeTo(null);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equalsIgnoreCase("Add Data")){
            MyTableGetter mtg = new MyTableGetter(this);
            mtg.setSize(500, 400);
            mtg.setLocationRelativeTo(null);
            mtg.setVisible(true);
        }
    }

    public void setTableData(Vector<String> acceptData){
        data.add(acceptData);
        c.repaint();
    }
}
