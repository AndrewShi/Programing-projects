import java.util.Random;
import java.util.Scanner;

public class Battleship {
	public boolean orientation; // vertical vs horizontal
	public int column;
	public int row;
	public String[][] board;
	public char letter;
	public boolean distance; //build forward or backwards
	Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public Battleship(){
		orientation = false;
		column = 0;
		row = 0;
		letter = 'A';
		board = new String[11][11];
		for(int i = 1; i < 11; i++){
			board[i][0] = Integer.toString(i);
		}
		for(int i = 1; i< 11; i++){
			board[0][i] = Character.toString(letter);
			letter++;
		}
	}
}
