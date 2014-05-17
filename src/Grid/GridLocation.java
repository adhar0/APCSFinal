package Grid;
import Piece.Griddable;

/**Class that represents an individual location on the Grid.
 * 
 * @author Aman Dhar, Jesse Chen
 *
 */
public class GridLocation 
{
	private int xLoc;
	private int yLoc;
	private Griddable p;//Griddable
	private Grid inGrid;

//	public GridLocation(Grid g)
//	{
//		xLoc = 0;
//		yLoc = 0;
//		p = null;
//		inGrid = g;
//	}
	
	/**Creates a new GridLocation at (x, y) in the Grid g.
	 * 
	 * @param x x coordinate of GridLocation
	 * @param y y coordinate of GridLocation
	 * @param g grid to which this GridLocation belongs
	 */
	public GridLocation(int x, int y, Grid g)
	{
		xLoc = x;
		yLoc = y;
		p = null;
		inGrid = g;
	}

	public int getX()
	{
		return xLoc;
	}
	
	public void setX(int xC){
		xLoc = xC;
	}
		
	public int getY()
	{
		return yLoc;
	}
	
	/**Puts a Griddable object into this GridLocation unless this is already inhabited.
	 * @post This GridLocation is now inhabited by a Griddable object
	 * @param pi Griddable object that will inhabit this GridLocation
	 * @return true if Griddable is added to this GridLocation successfully, false otherwise
	 */
	public boolean putGriddable(Griddable pi)
	{
		if(p == null)
		{
			p = pi;
			return true;
		}
		return false;
		
	}
	
	public Griddable getGriddable()
	{
		return p;
	}

	public Grid getGrid()
	{
		return inGrid;
	}




}
