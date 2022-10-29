import java.util.*;

public class RarMazeProblem {
    public static void main(String[] args) {
        int[][] arr =  {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1},};
        System.out.println(findPath(arr));
    }

    public static ArrayList<String> findPath(int[][] arr) {
        ArrayList<String> ans = new ArrayList<>();
        if (arr[0][0] == 0) return ans;
        int n = arr.length;
        int vis[][] = new int[n][n];
        solve(0, 0, arr, vis, n, ans, "");
        return ans;
    }

    static boolean isSafe(int x, int y, int[][] arr, int[][] visited, int n) {
        return ((x >= 0 && x < n) && (y >= 0 && y < n) && arr[x][y] == 1 && visited[x][y] == 0);
    }

    static void solve(int i, int j, int arr[][], int vis[][], int n, ArrayList<String> ans, String move) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }
        vis[i][j] = 1;
        // down
        if (isSafe(i + 1, j, arr, vis, n)) {
            solve(i + 1, j, arr, vis, n, ans, move + 'D');
        }
        // left
        if (isSafe(i, j - 1, arr, vis, n)) {
            solve(i, j - 1, arr, vis, n, ans, move + 'L');
        }

        if (isSafe(i, j + 1, arr, vis, n)) {
            solve(i, j + 1, arr, vis, n, ans, move + 'R');
        }
        // upward
        if (isSafe(i - 1, j, arr, vis, n)) {
            solve(i - 1, j, arr, vis, n, ans, move + 'U');
        }
        vis[i][j] = 0;
    }

}
