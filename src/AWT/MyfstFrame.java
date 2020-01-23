package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyfstFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2442202679047556573L;
	static Image img;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyfstFrame f = new MyfstFrame();
		f.setTitle("First experiment");
		f.setSize(400, 400);
		f.setIconImage(img);
		f.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		
		
		g.drawImage(img,50,50,200,200,null);
		g.drawRect(49, 49, 201,201);
	}

	MyfstFrame() {
		img= Toolkit.getDefaultToolkit().getImage("D:/All Files/Images/1img.jpeg");
		MediaTracker track = new MediaTracker(this);
		track.addImage(img, 0);
		try {
			track.waitForID(0);;
		}catch(InterruptedException e) {
			System.out.println("Unable to load");
		}
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
