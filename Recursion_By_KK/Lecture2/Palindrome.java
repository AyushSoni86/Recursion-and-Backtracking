package Recursion_By_KK.Lecture2;

public class Palindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));

    }

    static boolean isPalindrome(int n) {
        return n == rev2(n);
    }

    static int rev2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + rev2(n / 10);
    }
}
