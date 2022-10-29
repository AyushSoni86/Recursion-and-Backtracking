package Recursion_By_KK.Lecture11.N_Queens_Problem;

import java.util.*;

public class nqueensReturnList2 {
    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4);
        System.out.println(ans);
    }

    static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        solve(board, 0, result);

        return result;
    }

    static void solve(char[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            List<String> newList = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String str = new String(board[i]);
                newList.add(str);
            }
            ans.add(newList);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row + 1, ans);
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - 1] == 'Q')
                return false;
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == 'Q')
                return false;
        }
        return true;
    }

}
