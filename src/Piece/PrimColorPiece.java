package Piece;

/**
 * A type of Piece that represents either red, blue, or yellow
 * @author Jesse Chen
 *
 */
public class PrimColorPiece extends Piece{


	public static final int RED = 0;
	public static final int BLUE = 1;
	public static final int YELLOW = 2;
	
	
	public PrimColorPiece(int c){
		setColor(c);
	}
	
	/**
	 * creates a PrimColorPiece that is randomly red, blue, or yellow
	 */
	public PrimColorPiece()
	{
		int randy = (int)(Math.random() * 3);
		setColor(randy);
	}
	
//	public void setX(int x){
//		if(getLocation()
//	}
	
	
	
	
	

}
