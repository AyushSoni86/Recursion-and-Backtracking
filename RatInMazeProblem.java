import java.util.*;

public class RatInMazeProblem {
    public static void main(String[] args) {

    }

    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (arr[0][0] == 0) return ans;
        int srcx = 0;
        int srcy = 0;
        int[][] visited = new int[n][n];
        String path = "";
        solve(arr, n, ans, srcx, srcy, visited, path);
        Collections.sort(ans);
        return ans;
    }

    static void solve(int[][] arr, int n, ArrayList<String> ans, int x, int y, int[][] visited, String path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }
        visited[x][y] = 1;

        int newx = x + 1;
        int newy = y;
        if (isSafe(newx, newy, n, visited, arr)) {
            path += 'D';
        }


        visited[x][y] = 0;

    }

    private static boolean isSafe(int x, int y, int n, int[][] visited, int[][] arr) {
        if ((x >= 0 && x < n) && (y >= 0 && y < n) && arr[x][y] == 1 && visited[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }
}
