package dialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Very simple test illustrating the use of a modal dialogue.
 * 
 * @author waugh
 *
 */
public class ModalDialogTest {
	JDialog dial;
	
	public ModalDialogTest() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		dial = new JDialog(frame,true);
		dial.setLayout(new FlowLayout());
		JLabel label = new JLabel("Label!");
		JButton button = new JButton("OK");
		dial.add(label);
		dial.add(button);
		dial.pack();
				
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);
			}
		});
		
		System.out.println("Showing dialog");
		/*  For a modal dialogue, setVisible() does not return until the dialogue
		 *  is disposed or made invisible.  */
		dial.setVisible(true);
		System.out.println("back from showMessageDialog");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ModalDialogTest();
			}	
		});
	}

}
