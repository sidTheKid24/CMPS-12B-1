import java.util.*;
import java.io.*;
public class NQueens {

	public static int boardSize;
	public static int row;
	public static int column;
	//static array created from command line argument
	public static void main(String[] args){

		boardSize = Integer.parseInt(args[0]);
		int[][] board = new int[boardSize][boardSize];
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		board[x][y] = 1;
		display(board);
		LineOfSight(board);

	}

	public static void display(int board[][]){
		for(int i = 0; i < boardSize; i++){
			for(int j = 0; j < boardSize; j++){
				if(board[i][j] == 0){
					System.out.print("0");
				}
				else{
					System.out.print("1");
					row = i;
					column = j;
				}

			}
			System.out.println();
		}	// for placing another queen eliminate the row, column, and both diagonals from being placed for the next queen
	}
	public static void LineOfSight(int board[][]){
		
		for(int i = 0; i < boardSize; i++)
		{
			if(board[row][i] != 1){
				board[row][i] = 2;	
			}	
		}
	}
}
