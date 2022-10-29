package Recursion_By_KK.Lecture11;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };
        int[][] arr = new int[9][9];

        if (solve(arr)) {
            display(arr);
            System.out.println("Bravo ! Your sudoku is solved ");
        }
        else
            System.out.println("Cannot solve");
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptySpace = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptySpace = false;
                    break;
                }
            }
            if (!emptySpace) break;
        }
        if (emptySpace) return true;
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) return true;
                else board[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) return false;
        }

        for (int[] nums : board) {
            if (nums[col] == number) return false;
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == number) return false;
            }
        }
        return true;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j==3||j==6)
                    System.out.print("| ");
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
            if(i==2||i==5)
            System.out.println("-----------------------------");

        }
        System.out.println();
    }

//             8, 0, 0, 0, 0, 0, 0, 0, 0
//             0, 0, 3, 6, 0, 0, 0, 0, 0
//             0, 7, 0, 0, 9, 0, 2, 0, 0
//             0, 5, 0, 0, 0, 7, 0, 0, 0
//             0, 0, 0, 0, 4, 5, 7, 0, 0
//             0, 0, 0, 1, 0, 0, 0, 3, 0
//             0, 0, 1, 0, 0, 0, 0, 6, 8
//             0, 0, 8, 5, 0, 0, 0, 1, 0
//             0, 9, 0, 0, 0, 0, 4, 0, 0

}
