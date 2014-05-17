package Panel;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * Manages and switches between multiple panels in a CardLayout
 *
 */
public class PanelManager extends JFrame {

	JPanel cardPanel;
	
	/**
	 * Creates a window and adds multiple panels this PanelManager's CardLayout
	 * 
	 * @param title name of this PanelManager
	 */
	public PanelManager(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    cardPanel = new JPanel();
	    CardLayout cl = new CardLayout();
	    cardPanel.setLayout(cl);
	    
		MainMenu panel1 = new MainMenu(this);    
	    GamePanel panel2 = new GamePanel(this);
	    Instructions panel3 = new Instructions(this);
	    
	    //addKeyListener(panel2);
	
	    cardPanel.add(panel1,"MainMenu");
	    cardPanel.add(panel2,"GamePanel");
	    cardPanel.add(panel3,"Instructions");
	    
	    add(cardPanel);
	
	    setVisible(true);
	}

	/**
	 * Changes panel in the CardLayout
	 * 
	 * @param s name of the panel to switch to
	 */
	public void changePanel(String s) {
		((CardLayout)cardPanel.getLayout()).show(cardPanel,s);
		requestFocus();
	}

  
}