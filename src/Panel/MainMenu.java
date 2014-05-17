package Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Represents the main panel that opens when program is ran. Contains buttons to change to different panels.
 *
 */
public class MainMenu extends JPanel{

	PanelManager pm;
	JButton button,button2;
	ButtonListener l1, l2;
	
	/**
	 * Creates a new MainMenu in PanelManager w
	 * 
	 * @param w PanelManager to contain this MainMenu
	 */
	public MainMenu(PanelManager w){
		pm = w;
		this.setVisible(true);
		l1 = new ButtonListener("GamePanel");
		l2 = new ButtonListener("Instructions");
		
		button = new JButton("Game");
		button.addActionListener(l1);
		add(button);
		button2 = new JButton("Instructions");
		button2.addActionListener(l2);
		add(button2);
	}

	/**
	 * represents a buttonlistener that is used by the MainMenu class
	 */
	private class ButtonListener implements ActionListener{
		
		String panel;
		
		public ButtonListener(String s){
			panel = s;
		}
		
		@Override
		public void actionPerformed(ActionEvent event) {
			pm.changePanel(panel);
			
		}
	}
	
	
}
