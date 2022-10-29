package Recursion_By_Striver.Lecture2;

public class DS_03_print_Num_Till_0 {
    public static void main(String[] args) {
        printNum(1, 10);
    }

    static void printNum(int i, int n) {
        if (i == n) return;
        printNum(i + 1, n);
        System.out.println(i);
    }
}
