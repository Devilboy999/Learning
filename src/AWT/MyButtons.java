package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyButtons extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 65499166131054056L;

	Button b1,b2,b3;
	
	MyButtons(String frameTitle){
		super(frameTitle);
		setLayout(new FlowLayout());
		b1 = new Button("Yellow");
		b2 = new Button("Green");
		b3 = new Button("Orange");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("Exiting the frame");
				System.exit(0);
			}
		});
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str=e.getActionCommand();
		if(str.equalsIgnoreCase("Yellow")) {
			this.setBackground(Color.yellow);
			b1.setEnabled(false);
			b2.setEnabled(true);
			b3.setEnabled(true);
		}
		
		if(str.equalsIgnoreCase("Green")) {
			this.setBackground(Color.green);
			b2.setEnabled(false);
			b1.setEnabled(true);
			b3.setEnabled(true);
		}
		if(str.equalsIgnoreCase("Orange")) {
			this.setBackground(Color.orange);
			b3.setEnabled(false);
			b1.setEnabled(true);
			b2.setEnabled(true);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating the frame");
		MyButtons but = new MyButtons("Buttons frame");
		but.setSize(400,400);
		but.setVisible(true);
		
	}

}
