package Recursion_by_ApnaCollege.Class2_Questions;

public class Q1_tower_of_hanoi {
    public static void main(String[] args) {
        System.out.println(cnt(3));
//        towerOfHanoi(4, "S", "H", "D");
//        System.out.println(towerRet(4, "S", "H", "D"));
//        int steps = counttoh(4, "S", "H", "D");
//        System.out.println(steps);
    }

    static void towerOfHanoi(int n, String src, String helper, String des) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + des);
            return;
        }
        towerOfHanoi(n - 1, src, des, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + des);
        towerOfHanoi(n - 1, helper, src, des);
    }


    static int towerRet(int n, String src, String helper, String des) {
        if (n == 0) return 0;
        int count = 1;
        count += towerRet(n - 1, src, des, helper);
        count += towerRet(n - 1, helper, src, des);
        return count;
    }

    static int counttoh(int n, String T1, String T2, String T3) {
        int count = 1;
        if (n == 1) return count;
        count += counttoh(n - 1, T1, T3, T2);
        count += counttoh(n - 1, T3, T2, T1);
        return count;
    }

    static int cnt(int n){
        if (n==0) return 0;
        int count = 1;
       count+= cnt(n-1);
        count+= cnt(n-1);
        return count;
    }
}
