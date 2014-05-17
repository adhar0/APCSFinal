package Grid;
import Piece.Griddable;

/**Class that represents a Grid with x columns and y rows, made up of an array of GridLocations.
 * 
 * @author Jesse Chen
 *
 */
public class Grid 
{
	private GridLocation[][] gl;
	public static final int UP = 1;
	public static final int DOWN = -1;
	public static final int LEFT = -2;
	public static final int RIGHT = 2;
	
	/**
	 * @post A new Grid is created with x columns and y rows and filled with GridLocations
	 * @param x number of columns in Grid
	 * @param y number of rows in Grid
	 */
	public Grid(int x, int y)
	{
		gl = new GridLocation[x][y];
		for(int i = 0; i < gl.length; i++)
		{
			for(int j = 0; j < gl[0].length; j++)
			{
				gl[i][j] = new GridLocation(i,j, this);
			}
		}
	}
	
	/**Finds the spot in the indicated direction of a GridLocation g and returns it if it exists
	 * @param dir Direction in which an adjacent spot is to be found
	 * @param g GridLocation whose neighboring location will be checked
	 * @return GridLocation directly to the right of g if such GridLocation exists
	 */
	public GridLocation adjacentSpot(GridLocation g, int dir)
	{
		int x = g.getX();
		int y = g.getY();
		
		switch(dir){

			case UP:		if(isValid(x, y - 1)) return gl[x][y - 1]; //above

			case DOWN:	if(isValid(x, y + 1)) return gl[x][y + 1]; //below

			case RIGHT: 	if(isValid(x + 1, y)) return gl[x + 1][y]; //right

			case LEFT:	if(isValid(x - 1, y)) return gl[x - 1][y]; //left
			
			default: 		return null;
		}
	}
	
	public Griddable getGriddable(int x, int y)
	{
		if(isValid(x,y))
		{
			return gl[x][y].getGriddable();
		}
		return null;
	}
	
	
	/**Checks to see if a coordinate is valid in this Grid.
	 * 
	 * @param x x coordinate of location to be checked
	 * @param y y coordinate of location to be checked
	 * @return <code>true</code> if <code>loc</code> is valid in this grid,
     * <code>false</code> otherwise
	 */
	private boolean isValid(int x, int y)
	{
		if(x >= 0 && x < gl.length && y >= 0 && y < gl[0].length)
		{
			return true;
		}
		return false;
	}
	
	public GridLocation spot(int x, int y)
	{
		return gl[x][y];
	}
	
	public int getXSize()
	{
		return gl.length;
	}
	
	public int getYSize()
	{
		return gl[0].length;
	}

}
