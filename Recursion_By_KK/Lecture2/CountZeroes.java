package Recursion_By_KK.Lecture2;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(30001230));
        System.out.println(helper(30001230,0));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int cnt) {
        if (n == 0) return cnt;
        if (n % 10 == 0)
            return helper(n / 10, ++cnt);
        return helper(n / 10, cnt);
    }
}
