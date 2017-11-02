package frame_canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	// Drawing method
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.PINK);
	}
	
}
