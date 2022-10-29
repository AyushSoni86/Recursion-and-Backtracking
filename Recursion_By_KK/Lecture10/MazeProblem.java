package Recursion_By_KK.Lecture10;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(pathCount(3, 3));
//        System.out.println(count(4,4));
        printPath(3, 3, "");
//            diagonalPath(3,3,"");
    }

    static int pathCount(int r, int c) {
        if (r == 1 || c == 1) return 1;
        int left = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);
        return left + right;
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;
        return count(r - 1, c) + count(r, c - 1);
    }

    static void printPath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1)
            printPath(r - 1, c, p + 'D');
        if (c > 1)
            printPath(r, c - 1, p + 'R');
    }

    static void diagonalPath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1)
            diagonalPath(r - 1, c - 1, p + 'D');
        if (r > 1)
            diagonalPath(r - 1, c, p + 'V');
        if (c > 1)
            diagonalPath(r, c - 1, p + 'H');
    }
}
