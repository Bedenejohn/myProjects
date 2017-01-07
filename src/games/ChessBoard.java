package games;

import java.util.*;

public class ChessBoard 
{
	private Object [][] coors;
	public ChessBoard(int x, int y) 
	{
		coors = new Object [8][8];
		//This is the pieces for the white side of the board
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(i == 1){
					Piece pawn = new Pawn("white", true);
					coors[j][i] = pawn;
				}
				else{
				if(j == 0){
					Piece rook = new Rook("white", true);
					Piece rookBlack = new Rook("white", true);
					coors[0][0] = rook;
					coors[7][0] = rookBlack;
				}
				if(j == 1){
					Piece knight = new Knight("white", true);
					Piece knightBlack = new Knight("white", true);
					coors[1][0] = knight;
					coors[6][0] = knightBlack;
				}
				if(j == 2){
					Piece bishop = new Bishop("white", true);
					Piece bishopBlack = new Bishop("white", true);
					coors[2][0] = bishop;
					coors[5][0] = bishopBlack;
				}
				if(j == 3){
					Piece queen =  new Queen("white", true);
					coors[3][0] = queen;
				}
				if(j == 4){
					Piece king = new King("white", true);
					coors[4][0] = king;
				}
				}
			}
		}
				
		
		for(int i = 6; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(i ==6)
				{
					Piece pawn = new Pawn("black", true);
					coors[j][i] = pawn;
				}
				else
				{
					if(j == 0){
						Piece rook = new Rook("black", true);
						Piece rookBlack = new Rook("black", true);
						coors[0][7] = rook;
						coors[7][7] = rookBlack;
					}
					if(j == 1){
						Piece knight = new Knight("black", true);
						Piece knightBlack = new Knight("black", true);
						coors[1][7] = knight;
						coors[6][7] = knightBlack;
					}
					if(j == 2){
						Piece bishop = new Bishop("black", true);
						Piece bishopBlack = new Bishop("black", true);
						coors[2][7] = bishop;
						coors[5][7] = bishopBlack;
					}
					if(j == 3){
						Piece queen =  new Queen("black", true);
						coors[3][7] = queen;
					}
					if(j == 4)
					{
						Piece king = new King("black", true);
						coors[4][7] = king;
					}
				}
			}
		}
	}
		
	
	public void createBoard()
	{
		//I want to create a board that places the pieces that were created into their correct positions.
		//In order to do that, I will need to have two sets of all the pieces.
	}

}

	abstract class Piece {
		//This is my super Piece object that has all of the basic identifiers for a chess piece.
		abstract ArrayList<Integer> move(int up, int down);
		String color;
		boolean state;
		int x;
		int y;
		public int getX()
		{
			return x;
		}
		public int getY()
		 {
			return y;
		}
		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
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
		public ArrayList<Integer> move(int up, int down) 
		{
			return null;
					
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
		public ArrayList<Integer> move(int up, int down) 
		{
			return null;
			
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
		public ArrayList<Integer> move(int up, int down) 
		{
			return null;
					
		}
	}
	
	class Pawn extends Piece
	{
	
		int x;
		int y;
		boolean state;
		String color;
		boolean firstMove;
		public Pawn(String c, boolean s)
		{
			this.color = c;
			this.state = s;
			this.firstMove = true;
		}
		
		public ArrayList<Integer> move(int x, int y)
		{
		//This method contains every possible move a pawn can make.
			ArrayList<Integer> moves = new ArrayList<>();
			if(firstMove){
				moves.add((x * 10) + y + 2);
				firstMove = false;
			}
			moves.add((x * 10) + y + 1);
						
			if(x != 0){
					moves.add((x - 1) * 10 + (y + 1));
					
			}
			if(x != 7){
					moves.add((x + 1) * 10 + (y + 1));
			}
				return moves;
				
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
		public ArrayList<Integer> move(int up, int down) 
		{
			return null;
					
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
		public ArrayList<Integer> move(int up, int down)
		{
			return null;
		
		}
		
	}


