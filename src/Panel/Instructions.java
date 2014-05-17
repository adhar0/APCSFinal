package Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Represents the panel in which the user reads the instructions for the game.
 *
 */
public class Instructions extends JPanel implements ActionListener{

	private PanelManager pm;
	
	/**
	 * Creates a new Instructions panel in the PanelManager t.
	 * 
	 * @param t PanelManager to contain this Instructions
	 */
	public Instructions(PanelManager t){
		pm = t;
		this.setVisible(true);
		this.add(new JButton("Instructions"));
		JButton back = new JButton("back");
		back.addActionListener(this);
		this.add(back);
	}

	/**
	 * Changes the panel to the main menu when back button is pressed
	 * 
	 * @param arg0 ActionEvent created by the action performed
	 */
	public void actionPerformed(ActionEvent arg0) {
		pm.changePanel("MainMenu");	
	}
}
