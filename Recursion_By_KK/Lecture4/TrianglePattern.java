package Recursion_By_KK.Lecture4;

public class TrianglePattern {
    public static void main(String[] args) {
//        pattern(4);
        print3(4, 4, 4);
    }


    static void pattern(int n) {
        print(n, 0);
        print2(n, 0);
    }

    static void print(int row, int col) {
        if (row == 0)
            return;
        if (row > col) {
            System.out.print("*  ");
            print(row, col + 1);
        } else {
            System.out.println();
            print(row - 1, 0);
        }
    }

    static void print2(int row, int col) {
        if (row == 0)
            return;
        if (row > col) {
            print2(row, col + 1);
            System.out.print("*  ");
        } else {
            print2(row - 1, 0);
            System.out.println();
        }
    }

    static void print3(int r, int c, int s) {
        if (r == 0) return;
        if (c > 0) {
            print3(r, c - 1, s);
            System.out.print("* ");

        } else {
            print3(r - 1, s, s);
            System.out.println();
        }
    }
}
