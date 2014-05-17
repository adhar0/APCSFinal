package Panel;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Game.Game;
import Grid.Grid;
import Piece.Piece;

/**
 * Represents the panel where the game is to be played
 *
 */
public class GamePanel extends JPanel implements MouseListener, ActionListener{

	private Game g;
	private Grid gr;
	private PanelManager pm;

	/**
	 * Creates a new GamePanel in the PanelManager t.
	 * 
	 * @param t PanelManager to contain this GamePanel
	 */
	public GamePanel(PanelManager t){
		pm = t;

		
		this.setVisible(true);
		
		
		JButton back = new JButton("back");
		back.addActionListener(this);
		addMouseListener(this);
		
		this.add(new JButton("Board"));
		this.add(back);
		
	}
	
	/**
	 * Draws the 10 by 10 grid for the game to be played in
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < 11; i++){
			g.fillRect(100+i*50,50,5,500);
			g.fillRect(100, 50+i*50, 500, 5);
			g.fillRect(600, 550, 5, 5);
			
		}
	}
	
	/**
	 * Finds the coordinate location in the grid where the user clicks
	 */
	public void mouseClicked(MouseEvent e) {
		/*
		 * drop piece at nextPieceX
		 * nextPieceX comes from get method in Game
		 * after drop, save loc in Game
		 */
		
		Point p = e.getLocationOnScreen();
		double xC = p.getX();
		double yC = p.getY();
		for(int i = 0; i < 11; i++){
			System.out.println("jjjj");
			if(xC >= i*50 + 100 && xC < (i + 1)*50 + 100){
				if(yC >= i*50 + 50 && yC < (i + 1) * 50 + 50){
					Piece q = g.getNextPiece();
					g.dropNextPiece(i);
					System.out.println(q.getLocation().getX() + ", " + q.getLocation().getY());
					
				}
			}
		}
		repaint();
		
		
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		/*
		Point p = e.getLocationOnScreen();
		double xC = p.getX();
		double yC = p.getY();
		int width = this.getWidth();
		int colWidth = width/g.getGrid().getXSize();
		
		for(int i = 0; i < width; i += colWidth)
		{
			if(xC > i && xC < i + colWidth)
			{
				g.setNextPieceX(i);
			}
		}
		
		
		*/
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
