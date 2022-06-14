package appfortesting;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public ControlPanel() {
		super();
		JLabel label = new JLabel("A Label");
		JButton button1 = new JButton("Go!");
		JButton button2 = new JButton("Stop!");

		this.add(label);
		this.add(button1);
		this.add(button2);
	}
	
	
}
