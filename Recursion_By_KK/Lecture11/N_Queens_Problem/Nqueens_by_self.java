package Recursion_By_KK.Lecture11.N_Queens_Problem;

public class Nqueens_by_self {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(queens(board, 0));
    }

    static void display(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) System.out.print("@  ");
                else System.out.print(".  ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length ) {
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col - i]) return false;
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]) return false;
        }
        return true;
    }
}
