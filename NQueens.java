import java.util.*;
import java.io.*;
public class NQueens {

	public static int boardSize;
	//static array created from command line argument
	public static void main(String[] args){
		boardSize = Integer.parseInt(args[0]);
		int[][] board = new int[boardSize][boardSize];
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		board[x][y] = 1;




		display(board);

	}

	public static void display(int board[][]){
		for(int i = 0; i < boardSize; i++){
			for(int j = 0; j < boardSize; j++){
				if(board[i][j] == 0){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
}
