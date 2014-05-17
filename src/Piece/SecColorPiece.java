package Piece;

/**
 * A type of Piece that represents either green, orange, or purple
 * @author Jesse Chen, Aman Dhar
 *
 */
public class SecColorPiece extends Piece
{
	public static final int GREEN = 0;
	public static final int PURPLE = 1;
	public static final int ORANGE = 2;
	
	
	public SecColorPiece(int c){
		setColor(c);
	}
	
	/**
	 * creates a SecColorPiece that is randomly green, orange, or purple
	 */
	public SecColorPiece()
	{
		int randy = (int)(Math.random() * 3);
		setColor(randy);
	}
	
	

}