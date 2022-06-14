package appfortesting;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Application");
		JMenuItem exit = new JMenuItem("Exit");
		menuBar.add(menu);
		menu.add(exit);
		mainFrame.setJMenuBar(menuBar);

		mainFrame.add(controlPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

}
