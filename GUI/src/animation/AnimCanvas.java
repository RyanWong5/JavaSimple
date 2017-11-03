package animation;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimCanvas extends JPanel implements ActionListener {
	
	private int seconds, xCord;
	
	public AnimCanvas() { 
		// delay of: 1000 millisecond = 1 second 
		Timer time = new Timer(1000, this); // (milliseconds, listener)
		seconds = 0; xCord = 30;
		time.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Every set time runs performs this method and paintComponent
		seconds++; // Counting seconds
		
		// reset circle to start when reached right
		if(xCord > getWidth() - 30)
			xCord = 0;
		else 
			xCord++;
		
		// Repaints itself
		repaint();

	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		
		g.drawString(seconds + "", getWidth()/2, getHeight()/2);
		g.fillOval(xCord, getHeight()/2 - 15, 30, 30);
	}
	
	/**
	 * Timer uses an ActionListener
	 * - ensure you attach ActionListener to the timer (this)
	 */

}
