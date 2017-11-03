package listeners;

import javax.swing.JFrame;

public class ListenFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ListenCanvas canvas = new ListenCanvas();
		frame.add(canvas);
		frame.setVisible(true);
	}

}
