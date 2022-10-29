package Recursion_By_KK.Lecture10;

public class Printing_All_The_paths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        maze(arr, 0, 0, "");
    }

    static void maze(boolean[][] maze, int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) return;
        maze[r][c] = false;
        // going downward
        if (r < maze.length - 1)
            maze(maze, r + 1, c, 'D' + p);
        // going upward
        if (r > 0)
            maze(maze, r - 1, c, 'U' + p);
        // going towards right
        if (c < maze[0].length - 1)
            maze(maze, r, c + 1, 'R' + p);
        // going towards left
        if (c > 0)
            maze(maze, r, c - 1, 'L' + p);
        maze[r][c] = true;
    }
}
