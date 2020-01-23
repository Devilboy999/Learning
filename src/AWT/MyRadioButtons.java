package AWT;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyRadioButtons extends Frame implements ItemListener {

	String msg = "";
	CheckboxGroup cbg;
	Checkbox y, n;

	MyRadioButtons() {
		setLayout(new FlowLayout());
		cbg = new CheckboxGroup();
		y = new Checkbox("Yes", cbg, true);
		n = new Checkbox("No", cbg, false);
		add(y);
		add(n);
		y.addItemListener(this);
		n.addItemListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRadioButtons mr = new MyRadioButtons();
		mr.setTitle("Radio Buttons");
		mr.setSize(400,400);
		mr.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		repaint();

	}
	public void paint(Graphics g) {
		msg="Current Selection: ";
		msg+= cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
		
	}
}
