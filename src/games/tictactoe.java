package games;
import java.util.*;
public class tictactoe {
	private Scanner scan = new Scanner(System.in);
	public static void main(String [] args){
	
		for(int i = 0; i < 3; i++){System.out.println("|"); for(int j = 0; j < i; j++){System.out.println("-");}}
	}

	public class Board{
		private int piece;
		
		public Board(int piece){this.piece = piece;}
	}
}
