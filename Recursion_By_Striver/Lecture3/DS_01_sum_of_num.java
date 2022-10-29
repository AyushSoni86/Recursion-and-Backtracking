package Recursion_By_Striver.Lecture3;

public class DS_01_sum_of_num {
    public static void main(String[] args) {
        System.out.println(sumOfN1(20));
        sumOfN2(20,0);
    }

    static int sumOfN1(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfN1(n - 1);
    }

    static void sumOfN2(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfN2(n-1,sum+n);
    }
}
