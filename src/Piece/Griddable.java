package Piece;
import Grid.Grid;
import Grid.GridLocation;

/**
 * An interface representing all objects that can be put into a Grid
 * @author Jesse Chen, Aman Dhar
 *
 */
public interface Griddable
{
	/**
	 * 
	 * @return the Grid that the object currently is a part of.  
	 */
	Grid getGrid();
	
	/**
	 *
	 * @param gl moves the Griddable to the GridLocation gl.
	 */
	void move(GridLocation gl);//griddable
	
	/**
	 * what happens when the Griddable is "put into" the Grid
	 * 
	 * @return where it's final location is after drop() is run.
	 */
	GridLocation drop();
	
	/**
	 * 
	 * @return returns the GridLocation that this Griddable currently is in, return null if not in a location
	 */
	GridLocation getLocation();
	
	/**
	 * 
	 * @param gl the GridLocation that this Griddable is to be set to
	 */
	void setLocation(GridLocation gl);
	
}
