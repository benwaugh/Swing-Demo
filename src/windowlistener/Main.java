package windowlistener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Very simple program illustrating use of WindowListener.
 * 
 * @author waugh
 */
public class Main {
	/** Main program just calls createAndDisplayGui() on Event Dispatch Thread. */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndDisplayGui();
			}
		});
	}

	/** Create a WindowListenerPanel that will be displayed within a JFrame and listen for
	 *  window events from the JFrame. */
	private static void createAndDisplayGui() {
		JFrame frame = new JFrame("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WindowListenerPanel panel = new WindowListenerPanel();
		frame.add(panel);               // Add the panel to the frame.
		frame.addWindowListener(panel); // Add the panel as a WindowListener to the frame.
		frame.pack();                   // Lay out and size frame.
		frame.setVisible(true);
	}
}
