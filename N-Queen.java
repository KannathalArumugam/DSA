import java.util.Scanner;
public class Main {
	static Scanner scan;
	static int N_Queen = 4;
	static void Board(int board[][]) {
		int i;
		for (i = 0; i < N_Queen; i++) {
			for (int j = 0; j < N_Queen; j++)
				if (board[i][j] == 1) {
					System.out.print("Q\t");
				} else {
					System.out.print("-\t");
				}
			System.out.println("\n");
		}
	}

	static boolean PlaceOrNot(int board[][], int row, int column) {
		int i, j;
		for (i = 0; i < column; i++) {
			if (board[row][i] == 1)
				return false;
		}
		for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (i = row, j = column; j >= 0 && i < N_Queen; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}

	static boolean BoardSolution(int board[][], int column) {
		if (column >= N_Queen)
			return true;
		for (int i = 0; i < N_Queen; i++) {
			if (PlaceOrNot(board, i, column)) {
				board[i][column] = 1;
				if (BoardSolution(board, column+ 1))
					return true;
				board[i][column] = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Solution for N-Queen Problem:");
		N_Queen= scan.nextInt();
		int[][] board = new int[N_Queen][N_Queen];
		if (!BoardSolution(board, 0)) {
			System.out.println("Solution not found.");
		}
		Board(board);
	}
}

