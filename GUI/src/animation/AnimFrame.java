package animation;

import javax.swing.JFrame;

public class AnimFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animation");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null); // centered screen when run
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AnimCanvas canvas = new AnimCanvas();
		frame.add(canvas);
		frame.setVisible(true);
	}
}
