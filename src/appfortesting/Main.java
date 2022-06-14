package appfortesting;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import windowlistener.WindowListenerPanel;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{createAndDisplayGUI();});
		
	}

	private static void createAndDisplayGUI() {
		JFrame mainFrame = new JFrame("Control");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel controlPanel = new ControlPanel();

		mainFrame.add(controlPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

}
