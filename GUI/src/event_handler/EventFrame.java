package event_handler;

import javax.swing.JFrame;

public class EventFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EventCanvas canvas = new EventCanvas();
		frame.add(canvas);
		frame.setVisible(true);
	}

}
