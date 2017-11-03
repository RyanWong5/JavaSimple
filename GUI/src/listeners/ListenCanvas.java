package listeners;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ListenCanvas extends JPanel implements MouseListener, KeyListener {
	
	int xCord, yCord;
	Character display;
	
	// Constructor
	public ListenCanvas() {
		addMouseListener(this); // mouse events
		addKeyListener(this); 	// key events
		setFocusable(true);		// for keys as well
		
		xCord = 0; yCord = 0;
		display = 'a';
		
	}
	
	// Painting
	public void paintComponent(Graphics g) {
		setBackground(Color.BLACK);
		g.setColor(Color.CYAN);
		g.fillOval(xCord - 25, yCord - 25, 50, 50);
		g.drawString("Type text or click", 175, 250);
		g.drawString(display.toString(), 225, 270);
	}
	
	// Key Events
	@Override
	public void keyTyped(KeyEvent e) {
		display = e.getKeyChar();
		repaint();
	}

	// Mouse Events
	@Override
	public void mouseClicked(MouseEvent e) {
		xCord = e.getX();
		yCord = e.getY();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		xCord = e.getX();
		yCord = e.getY();
		repaint();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
