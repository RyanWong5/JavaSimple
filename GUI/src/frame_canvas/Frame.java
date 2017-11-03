package frame_canvas;
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ends program when exit frame
		
		// TODO: Now with this empty frame, we need to add a canvas (drawing) to the frame
		Canvas canvas = new Canvas(); // Look at the created Canvas class created
		frame.add(canvas); // Add the canvas to the frame
		frame.setVisible(true);
	}

	/**
	 * You can think of a JFrame exactly like a picture frame without the picture
	 * - you can determine it's size
	 * - you can add pictures (canvas) to the frame
	 */
	
}
