package Recursion_By_KK.Lecture2;

public class PrintNunm {
    public static void main(String[] args) {
        print(5);
        print1(5);
    }

    static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.println(n);
    }

    static void print1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print1(n - 1);
    }
}
