package Recursion_By_KK.Lecture11.N_Queens_Problem;

import java.util.*;

public class N_queens_return_list {
    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4);
        System.out.println(ans);
    }

    public static List<List<String>> outer = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        solve(board, 0);
        return outer;
    }


    static void solve(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                solve(board, row + 1);
                board[row][col] = false;
            }
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - 1])
                return false;
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i])
                return false;
        }
        return true;
    }

    public static void display(boolean[][] board) {
//       List<List<String>> outer = new ArrayList<>();
        List<String> internal = new ArrayList<>();
        for(boolean[] row : board) {
            String temp = "";
            for(boolean element : row) {
                if(element) {
                    temp += "Q";
                } else {
                    temp += ".";
                }
            }
            internal.add(temp);
        }
        outer.add(internal);
    }







    static void display1(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) System.out.print("@  ");
                else System.out.print(".  ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
    }
}
