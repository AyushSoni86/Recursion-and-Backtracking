package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_fibonacci_number {
    public static void main(String[] args) {
        //  0 1 1 2 3 5 8 13 21 34 55 89
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        Arrays.fill(dp, -1);
//        int ans = fibo(n,dp);
//        System.out.println();
//        System.out.println(ans);
////        System.out.println(fibo1(50));
        System.out.println(fibo2(40));
        System.out.println(fibo3(41));
    }

    // fibonacci using memoize method of dynamic programming
    static int fibo(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        System.out.print(n + "  ");
        return fibo(n - 2, dp) + fibo(n - 1, dp);
    }

    // simple recursion program to find fibonacci number
    static int fibo1(int n) {
        if (n <= 1) return n;
        return fibo1(n - 2) + fibo1(n - 1);
    }

    //tabulation method of dynamic programming

    static int fibo2(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // simple function to find nth fibonacci number

    static int fibo3(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;

        //  0 1 1 2 3 5 8 13 21 34 55 89
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            b = a;
            a = sum;
        }
        return a;
    }
}
