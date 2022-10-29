package Recursion_By_KK.Lecture10;

import java.util.Arrays;

public class MazeProblem_printPath_inMatrixAnd_String_also {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] arr = new int[maze.length][maze[0].length];
        mazeProb(0, 0, "", 1, maze, arr);
    }

    static void mazeProb(int r, int c, String p, int steps, boolean[][] maze, int[][] arr) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            arr[r][c] = steps;

            for (int[] temp : arr) {
                System.out.println(Arrays.toString(temp));
            }
            System.out.println();
        }

        if (!maze[r][c]) return;
        maze[r][c] = false;
        arr[r][c] = steps;
        if (r > 0)
            mazeProb(r - 1, c, p + 'U', steps + 1, maze, arr);
        if (r < maze.length - 1)
            mazeProb(r + 1, c, p + 'D', steps + 1, maze, arr);
        if (c > 0)
            mazeProb(r, c - 1, p + 'L', steps + 1, maze, arr);
        if (c < maze[0].length - 1)
            mazeProb(r, c + 1, p + 'R', steps + 1, maze, arr);

        maze[r][c] = true;
        arr[r][c] = 0;
    }
}
