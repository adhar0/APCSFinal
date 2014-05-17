package Piece;

import Grid.Grid;
import Grid.GridLocation;

/**
 * A class to represent a powerup that can be put into the Grid, with different affect than dropping a Piece
 * @author Jesse Chen, Aman Dhar
 *
 */
public abstract class PowerUp implements Griddable
{
	private Grid inGrid;
	private GridLocation g;
	
	public PowerUp()
	{
		inGrid = g.getGrid();
	}
	
	
	public Grid getGrid()//griddable
	{
		return inGrid;
	}
	
	/**
	 * moves the Piece to the GridLocation gl
	 * won't do anything if setLocation has not been called first
	 * @pre gl is not null
	 * @post g is changed to gl
	 * @param gl the GridLocation that this piece is to be moved to
	 * 
	 */
	public void move(GridLocation gl)//griddable
	{
		g = gl;
	}
	
	/**
	 * "drops" the piece, what is does is still undecided
	 * @pre setLocation() has already been called
	 * @post g will be changed to the final location
	 * @return it's final location
	 */
	public GridLocation drop() {//griddable
		
		return null;
	}
	
	public GridLocation getLocation() {//griddable
		return g;
	}
	
	public void setLocation(GridLocation gridlocation)//griddable
	{
		g = gridlocation;
		inGrid = g.getGrid();
	}

	/**
	 * will affect other Griddables in the Grid, depending on what the underling classes decide to do
	 * @pre inGrid and g are initialized
	 * @post other Griddables are changed/deleted
	 */
	public void power()
	{
		//to be implemented in the underling classes
	}
	
	
}