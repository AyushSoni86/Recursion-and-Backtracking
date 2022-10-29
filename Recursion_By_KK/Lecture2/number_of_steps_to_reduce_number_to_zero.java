package Recursion_By_KK.Lecture2;

public class number_of_steps_to_reduce_number_to_zero {
    public static void main(String[] args) {
        System.out.println(steps(8));
    }

    static int steps(int n){
        return helper(n,0);
    }

    private static int helper(int n, int cnt) {
        if (n==0) return cnt;
        if ((n&1)==0)
            return helper(n/2,cnt+1);
        else
            return helper(n-1,cnt+1);
    }
}
