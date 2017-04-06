package ChessBoard;

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

	public ArrayList<Integer> pawnChoices(ArrayList<Integer> move, Pawn o)
	{
		ArrayList<Integer> choices = new ArrayList<>();
		for(int i : move){
			Piece choiceCheck = (Piece)coors[i/10][i%10];
			if(coors[i/10][i%10] == null && i/10 == o.getX()){
				choices.add(i);
			}
			if(coors[i/10][i%10] != null && !choiceCheck.getColor().equals(o.getColor()) && choiceCheck.getX() != o.getX()){
				choices.add(i);
			}
		}
		return choices;
	}

	public ArrayList<Integer> knightChoices(ArrayList<Integer> move, Knight k)
	{
		ArrayList<Integer> choices = new ArrayList<>();

		for(int i : move){
			Piece choiceCheck = (Piece)coors[i/10][i%10];
			if(coors[i/10][i%10] == null){
				choices.add(i);
			}
			if(coors[i/10][i%10] != null && !choiceCheck.getColor().equals(k.getColor())){
				choices.add(i);
			}

		}
		return choices;
	}

	public ArrayList<Integer> rookChoices(ArrayList<Integer> moves, Rook r)
	{
		Piece choiceCheck;
		ArrayList<Integer> choices = new ArrayList<>();
		for(int y = r.getY(); y < 7; y++){
			choiceCheck = (Piece)coors[r.getX()][y];
			if(coors[r.getX()][y] == null){
				choices.add(r.getX() * 10 + y);
			}else
			if(coors[r.getX()][y] != null && (!choiceCheck.getColor().equals(r.getColor()))){
				choices.add(r.getX() * 10 + y);
				break;
			}
			else{
				break;
			}
		}
		for(int y = r.getY(); y > 0; y--){
			choiceCheck = (Piece)coors[r.getX()][y];
			if(coors[r.getX()][y] == null){
				choices.add(r.getX() * 10 + y);
			}else
			if(coors[r.getX()][y] != null && (!choiceCheck.getColor().equals(r.getColor()))){
				choices.add(r.getX() * 10 + y);
				break;
			}
			else{
				break;
			}
		}
		for(int x = r.getX(); x < 7; x++){
			choiceCheck = (Piece)coors[x][r.getY()];
			if(coors[x][r.getY()] == null){
				choices.add(x * 10 + r.getY());
			}else
			if(coors[x][r.getY()] != null && (!choiceCheck.getColor().equals(r.getColor()))){
				choices.add(x * 10 + r.getY());
				break;
			}
			else{
				break;
			}
		}
		for(int x = r.getX(); x > 0; x--){
			choiceCheck = (Piece)coors[x][r.getY()];
			if(coors[x][r.getY()] == null){
				choices.add(x * 10 + r.getY());
			}else
			if(coors[x][r.getY()] != null && (!choiceCheck.getColor().equals(r.getColor()))){
				choices.add(x * 10 + r.getY());
				break;
			}
			else{
				break;
			}
		}


		return choices;
	}

	public ArrayList<Integer> bishopChoices(ArrayList<Integer> move, Bishop b)
	{
		Piece choiceCheck;
		ArrayList<Integer> choices = new ArrayList<>();
		int ystore = b.getY();
		int y = b.getY() + 1;
		for(int x = b.getX() + 1; x < 8 && y < 8; x++){
			choiceCheck = (Piece)coors[x][y];
			if(coors[x][y] == null){
				choices.add(x * 10 + y);
				y++;
			}else
			if(coors[x][y] != null && (!choiceCheck.getColor().equals(b.getColor()))){
				choices.add(x * 10 + y);
				y++;
				break;
			}else{
				break;
			}

		}
		y = ystore;

		for(int x = b.getX() + 1; x > 0 && y > 0; x--){
			choiceCheck = (Piece)coors[x][y];
			if(coors[x][y] == null){
				choices.add(x * 10 + y);
				y--;
			}else
			if(coors[x][y] != null && (!choiceCheck.getColor().equals(b.getColor()))){
				choices.add(x * 10 + y);
				y--;
				break;
			}else{
				break;
			}

		}
		y = ystore;
		for(int x = b.getX() + 1; x < 8 && y > 0; x++){
			choiceCheck = (Piece)coors[x][y];
			if(coors[x][y] == null){
				choices.add(x * 10 + y);
				y--;
			}else
			if(coors[x][y] != null && (!choiceCheck.getColor().equals(b.getColor()))){
				choices.add(x * 10 + y);
				y--;
				break;
			}else{
				break;
			}

		}
		y = ystore;
		for(int x = b.getX() + 1; x > 0 && y < 8 ; x--){
			choiceCheck = (Piece)coors[x][y];
			if(coors[x][y] == null){
				choices.add(x * 10 + y);
				y++;
			}else
			if(coors[x][y] != null && (!choiceCheck.getColor().equals(b.getColor()))){
				choices.add(x * 10 + y);
				y++;
				break;
			}else{
				break;
			}

		}
		return choices;
	}

	public void kingChoices(){

	}

	public void queenChoices(){

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
		public ArrayList<Integer> move(int x, int y)
		{
			ArrayList<Integer> moves = new ArrayList<>();
			int xstore = x;
			int ystore = y;
			x = x+1;
			y = y+1;
			while( x < 8 && y < 8){
				moves.add(x*10 + y);
				x++;
				y++;
			}
			x = xstore;
			y = ystore;
			x = x-1;
			y = y+1;
			while(x > -1 && y < 8){
				moves.add(x*10+y);
				x--;
				y++;
			}
			x = xstore;
			y = ystore;
			x -= 1;
			y -= 1;
			while(x > -1 && y > -1){
				moves.add(x*10+y);
				x--;
				y--;
			}
			x = xstore;
			y = ystore;
			x += 1;
			y -= 1;
			while(x < 8 && y > -1){
				moves.add(x * 10 + y);
				x++;
				y--;
			}
			x = xstore;
			y = ystore;
			return moves;

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
		public ArrayList<Integer> move(int x, int y)
		{
			ArrayList<Integer> moves = new ArrayList<>();
			int xstore = x;
			int ystore = y;
			x = x+1;
			y = y+1;
			while( x < 8 && y < 8){
				moves.add(x*10 + y);
				x++;
				y++;
			}
			x = xstore;
			y = ystore;
			x = x-1;
			y = y+1;
			while(x > -1 && y < 8){
				moves.add(x*10+y);
				x--;
				y++;
			}
			x = xstore;
			y = ystore;
			x -= 1;
			y -= 1;
			while(x > -1 && y > -1){
				moves.add(x*10+y);
				x--;
				y--;
			}
			x = xstore;
			y = ystore;
			x += 1;
			y -= 1;
			while(x < 8 && y > -1){
				moves.add(x * 10 + y);
				x++;
				y--;
			}
			x = xstore;
			y = ystore;

			for(int i = x+1; i < 8; i++){
				moves.add((i*10) + y);
			}
			for(int i = y+1; i < 8; i++){
				moves.add(x*10 + i);
			}
			for(int i = y-1; i > -1; i--){
				moves.add(x * 10 + i);
			}

			for(int i = x-1; i > -1; i--){
				moves.add((i * 10) + y);
			}
			return moves;
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
		public ArrayList<Integer> move(int x, int y)
		{
			ArrayList<Integer> moves = new ArrayList<>();
			if(x != 0){
				moves.add((x-1)*10 + y);
			}
			if(x!=0 && y != 0){
				moves.add((x-1)*10 + y-1);
			}
			if(x != 0 && y != 7){
				moves.add((x-1)*10 + y+1);
			}
			if(x!=7){
				moves.add((x+1)*10 + y);
			}
			if(x!=7 && y!=0){
				moves.add((x+1)*10 + y-1);
			}
			if(x!=7 && y!=7){
				moves.add((x+1)*10 + y+1);
			}
			if(y!=7){
				moves.add(x*10 + y+1);
			}
			if(y!=0){
				moves.add(x*10 + y-1);
			}
			return moves;

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
		public ArrayList<Integer> move(int x, int y)
		{
			//I don't need to set a special condition for this piece. It just needs the right move set
			ArrayList<Integer> moves = new ArrayList<>();
			if( y != 0 || y != 1){
				moves.add((x+1)*10 + y - 2);
				moves.add((x-1)*10 + y - 2);
			}
			if( y != 7 || y != 6){
				moves.add((x+1)*10 + y + 2);
				moves.add((x-1)*10 + y + 2);
			}
			if( x != 0 || x != 1 ){
				moves.add((x - 2) * 10 + y + 1);
				moves.add((x - 2) * 10 + y - 1);
			}
			if(x != 7 || x != 6 ){
				moves.add((x + 2) * 10 + y + 1);
				moves.add((x + 2) * 10 + y - 1);
			}
			return moves;
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
		public ArrayList<Integer> move(int x, int y)
		{
			ArrayList<Integer> moves = new ArrayList<>();
			for(int i = x+1; i < 8; i++){
				moves.add((i*10) + y);
			}
			for(int i = y+1; i < 8; i++){
				moves.add(x*10 + i);
			}
			for(int i = y-1; i > -1; i--){
				moves.add(x * 10 + i);
			}

			for(int i = x-1; i > -1; i--){
				moves.add((i * 10) + y);
			}
			return moves;

		}

	}