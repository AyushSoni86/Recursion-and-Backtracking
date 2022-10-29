package Recursion_By_KK.Lecture10;

import java.util.Arrays;

public class printPathIn_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},

        };
        maze(arr, 0, 0, 1);
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void maze(int[][] maze, int r, int c, int i) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            maze[r][c] = i;
            printArr(maze);
            return;
        }
        if (maze[r][c] != 0) return;
        maze[r][c] = i;
        // going downward
        if (r < maze.length - 1)
            maze(maze, r + 1, c, i + 1);
        // going upward
        if (r > 0)
            maze(maze, r - 1, c, i + 1);
        // going towards right
        if (c < maze[0].length - 1)
            maze(maze, r, c + 1, i + 1);
        // going towards left
        if (c > 0)
            maze(maze, r, c - 1, i + 1);
        maze[r][c] = 0;
    }
}
