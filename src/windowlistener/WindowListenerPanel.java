package windowlistener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  Panel that illustrates the use of the WindowListener interface by counting
 *  window events and displaying the number that have occurred.
 * 
 * @author waugh
 */
@SuppressWarnings("serial")
public class WindowListenerPanel extends JPanel implements WindowListener {
	private JLabel label = new JLabel("No window events yet");
	private int numEvents = 0;

	/** Create WindowListenerPanel with JLabel to display event count. */
	public WindowListenerPanel() {this.add(label);}
	
	/** Update the display with the current number of events. */
	private void update() {
		label.setText(String.format("%d events",numEvents));
	}

	@Override
	public void windowOpened(WindowEvent e) {
		numEvents++;
		update();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		numEvents++;
		update();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		numEvents++;
		update();

	}

	@Override
	public void windowIconified(WindowEvent e) {
		numEvents++;
		update();
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		numEvents++;
		update();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		numEvents++;
		update();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		numEvents++;
		update();
	}
}
