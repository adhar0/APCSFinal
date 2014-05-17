package Game;
import Grid.*;
import Piece.*;

/**Class that represents the Game and all of its logic. Decides when pieces will be dropped and executes drops.
 * 
 * @author Aman Dhar, Jesse Chen
 *
 */
public class Game {

	private Grid g;
	private PrimColorPiece nextPiece;
	private int nextPieceX;
	
	/**
	 * @post Creates a new Game with a default 10 by 10 grid and a new PrimColorPiece
	 */
	public Game()
	{
		g = new Grid(10, 10);
		nextPiece = new PrimColorPiece();
		nextPieceX = 0;
	}
	
	/**
	 * 
	 * @param x x column where the next piece is to be dropped
	 * @post Next piece is dropped into Grid. New next piece is created.
	 */
	public void dropNextPiece(int x)
	{
		GridLocation spot = g.spot(x, 0);
		spot.putGriddable(nextPiece);
		nextPiece.setLocation(spot);

		nextPiece.drop();
		///collision detection and stuff
		nextPiece = new PrimColorPiece();
	}
	
	public Grid getGrid()
	{
		return g;
	}
	
	public PrimColorPiece getNextPiece()
	{
		return nextPiece;
	}
	
	public void setNextPieceX(int x)
	{
		nextPieceX = x;
	}
	
	public int getNextPieceX()
	{
		return nextPieceX;
	}
	
	
	
	
	
}
