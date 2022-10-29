package Recursion_By_KK.Lecture11.K_knights_Problem;

public class N_knights_returnCount {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n,0);
    }

    static void nKnights(boolean[][] board, int row, int col, int knights, int count) {
        if (knights == 0) {
            display(board);

            return;
        }
        if (row == board.length - 1 && col == board.length) return;
        if (col == board.length) {
            nKnights(board, row + 1, 0, knights,count);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, knights - 1,count+1);
            board[row][col] = false;
        }
        nKnights(board, row, col + 1, knights,count);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) return false;
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) return false;
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) return false;
        }
        if (isValid(board, row - 1, col + 2)) {
            return !board[row - 1][col + 2];
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) return true;
        return false;
    }

    static void display(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) System.out.print("K  ");
                else System.out.print(".  ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
    }

}
