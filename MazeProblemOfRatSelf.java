import java.util.ArrayList;

public class MazeProblemOfRatSelf {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        System.out.println(findPath(arr));

    }

    static ArrayList<String> findPath(int[][] arr) {
        int n = arr.length;
        ArrayList<String> ans = new ArrayList<>();
        if (arr[0][0] == 0) return ans;
        int[][] isVisited = new int[n][n];

        solve(0, 0, arr, isVisited, n, ans, "");

        return ans;
    }

    static void solve(int x, int y, int[][] arr, int[][] isVis, int n, ArrayList<String> ans, String path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }

        isVis[x][y] = 1;
        // right
        if (isSafe(x, y + 1, arr, isVis, n)) {
            solve(x, y + 1, arr, isVis, n, ans, path + 'R');
        }
        // left
        if (isSafe(x, y - 1, arr, isVis, n)) {
            solve(x, y - 1, arr, isVis, n, ans, path + 'L');
        }
        // up
        if (isSafe(x - 1, y, arr, isVis, n)) {
            solve(x - 1, y, arr, isVis, n, ans, path + 'U');
        }
        // down
        if (isSafe(x + 1, y, arr, isVis, n)) {
            solve(x + 1, y, arr, isVis, n, ans, path + 'D');
        }

        isVis[x][y] = 0;
    }

    static boolean isSafe(int x, int y, int[][] arr, int[][] isVis, int n) {
        return (x >= 0 && x < n) && (y >= 0 && y < n) && arr[x][y] == 1 && isVis[x][y] == 0;
    }
}
