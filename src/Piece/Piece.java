package Piece;
import Grid.*;


/**
 * Class that represents a game piece that can be put into the grid(not a powerup)
 * 
 * @author Jesse Chen
 *
 */
public abstract class Piece implements Griddable
{
	private GridLocation g;
	private int color;
	private Grid inGrid;
	
	/**
	 * Constructor that creates a piece
	 */
	public Piece()
	{
		//inGrid = g.getGrid();
	}
	
	public void setColor(int c){
		color = c;
	}
	
	/**
	 * might return null
	 */
	public GridLocation getLocation() {//griddable
		return g;
	}
	
	/**
	 * "drops" the piece, it goes as far down as it can without hitting anything
	 * @pre setLocation() has already been called
	 * @post g will be changed to the final location
	 * @return it's final location
	 */
	public GridLocation drop() {//griddable
		GridLocation below = getGrid().belowSpot(getLocation());
		while(below != null && below.getGriddable() == null)
		{
			g.putGriddable(null);
			move(below);
			
		}
		below.putGriddable(this);
		return below;
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
		if(inGrid != null)
		{
			g = gl;
		}

	}
	
	public Grid getGrid()//griddable
	{
		return inGrid;
	}
	
	public int getColor()
	{
		return color;
	}
	
	
	//precondition location = valid ish
	/**
	 * @pre gridlocation is a valid location
	 * @param gridlocation the GridLocation that this Piece is to be put into
	 * @post g & inGrid are initialized.  
	 */
	public void setLocation(GridLocation gridlocation)//griddable
	{
		g = gridlocation;
		inGrid = g.getGrid();
	}
}