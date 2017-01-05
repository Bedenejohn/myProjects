package games;


public class ChessBoard 
{
	private Object [][] coors;
	public ChessBoard(int x, int y) 
	{
		coors = new Object [8][8];
		//coors[8][0] = new Rook("white", true);
		for(int i = 0; i < coors.length; i++)
		{
			Piece pawn = new Pawn("white", true);
			coors[i][1] = pawn;
			
			if(coors[i][i] == coors[0][0] || coors[i][i] == coors[0][7]){
				Piece rook = new Rook("white", true);
				coors[01][0] = rook;
			}
			if(coors[i][i] == coors[0][0]){
				Piece rook = new Rook("white", true);
				coors[i][i] = rook;
			}
			if(coors[i][i] == coors[0][1]){
				Piece knight = new Knight("white", true);
				coors[i][i] = knight;
			}
			if(coors[i][i] == coors[0][2]){
				Piece bishop = new Bishop("white", true);
				coors[i][i] = bishop;
			}
			if(coors[i][i] == coors[0][3]){
				Piece queen =  new Queen("white", true);
				coors[i][i] = queen;
			}
			
		}
		
	}
		
	
	public void createBoard()
	{
		//I want to create a board that places the pieces that were created into their correct positions.
		//In order to do that, I will need to have two sets of all the pieces.
	}

}

abstract class Piece 
{
	//This is my super Piece object that has all of the basic identifiers for a chess piece.
	abstract public void move(int up, int down);
	String color;
	boolean state;
	int x;
	int y;
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}

class Bishop extends Piece {
		int x;
		int y;
		boolean state;
		String color;
		public Bishop(String c, boolean s)
		{
			this.color = c;
			this.state = s;
		}
	public void move(int up, int down) 
	{
				
	}
	
}

class Queen extends Piece{

	int x;
	int y;
	boolean state;
	String color;
	public Queen(String c, boolean s)
	{
		this.color = c;
		this.state = s;
	}
	@Override
	public void move(int up, int down) 
	{
				
	}	
}

class King extends Piece
{
	int x;
	int y;
	boolean state;
	String color;
	public King(String c, boolean s)
	{
		this.color = c;
		this.state = s;
	}
	@Override
	public void move(int up, int down) 
	{
				
	}
}

class Pawn extends Piece
{

	int x;
	int y;
	boolean state;
	String color;
	public Pawn(String c, boolean s)
	{
		this.color = c;
		this.state = s;
	}
	@Override
	public void move(int up, int down)
	{
				
	}
	

}

class Knight extends Piece
{
	int x;
	int y;
	boolean state;
	String color;
	public Knight(String c, boolean s)
	{
		this.color = c;
		this.state = s;
	}
	@Override
	public void move(int up, int down) 
	{
				
	}

	
	
}

class Rook extends Piece
{
	int x;
	int y;
	boolean state;
	String color;
	public Rook(String c, boolean s)
	{
		this.color = c;
		this.state = s;
	}
	@Override
	public void move(int up, int down)
	{
	
	}
	
}


