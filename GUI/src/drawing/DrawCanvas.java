package drawing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawCanvas extends JPanel {
	
	/**
	 * Drawing a snowman
	 */
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();		// Gets panel's width
		int height = getHeight();	// Get panel's height 
		
		setBackground(new Color(75, 125, 255));
		g.setColor(Color.WHITE);
		
		// Body
		g.fillOval(width/2 - 30, height/2 - 30, 60, 60); // Center Body
		g.fillOval(width/2 - 20, height/2 - 65, 40, 40); // Head
		g.fillOval(width/2 - 40, height/2 + 20, 80, 80); // Bottom
		
		// Hat
		g.setColor(Color.BLACK);
		g.fillRect(width/2 - 25, height/2 - 80, 50, 20); 	// Bottom
		g.fillRect(width/2 - 10, height/2 - 100, 20, 20); 	// Top
		
		// Arms
		g.drawLine(width/2 - 30, height/2, width/2 - 75, height/2); // Left arm
		g.drawLine(width/2 + 30, height/2, width/2 + 75, height/2); // Right arm

	}

}
