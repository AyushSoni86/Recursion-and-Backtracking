package Recursion_By_Striver.Lecture3;

public class DS_02_factorial_of_n {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
