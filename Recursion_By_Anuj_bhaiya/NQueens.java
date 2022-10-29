package Recursion_By_Anuj_bhaiya;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

        System.out.println(nQueens(board, 0));
        System.out.println(Arrays.deepToString(board));
    }

    static int nQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueens(board, row + 1);
                board[row][col] = false;

            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) System.out.print("Q  ");
                else System.out.print("X  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i])
                return false;
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i])
                return false;
        }
        return true;
    }
}
