package drawing;

import javax.swing.JFrame;

public class DrawFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add canvas to frame
		DrawCanvas canvas = new DrawCanvas();
		frame.add(canvas);
		frame.setVisible(true);
	}
	
}
