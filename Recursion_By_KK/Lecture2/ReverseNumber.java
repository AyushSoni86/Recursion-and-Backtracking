package Recursion_By_KK.Lecture2;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
//        System.out.println(reverse(1234,1));
        reverse(1234);
        System.out.println(sum);
        System.out.println(rev2(38974));

    }

    static void reverse(int n) {
        if (n == 0) return;
        sum = sum * 10 + n % 10;
        reverse(n / 10);
    }

    static int rev2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n)return n;
        int rem = n %10;
        return rem*(int)Math.pow(10,digits-1) + rev2(n/10);
    }
}
