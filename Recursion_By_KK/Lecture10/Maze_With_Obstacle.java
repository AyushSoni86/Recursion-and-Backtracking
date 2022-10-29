package Recursion_By_KK.Lecture10;

public class Maze_With_Obstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        mazePath(maze, 0, 0, "");
    }

    static void mazePath(boolean[][] maze, int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1)
            mazePath(maze, r + 1, c, p + 'D');
        if (c < maze[0].length - 1)
            mazePath(maze, r, c + 1, p + 'R');
    }

}
