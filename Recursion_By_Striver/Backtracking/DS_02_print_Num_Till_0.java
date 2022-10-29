package Recursion_By_Striver.Backtracking;

public class DS_02_print_Num_Till_0 {
    public static void main(String[] args) {
        printTill0(0,9);
    }

    static void printTill0(int i , int n){
        if (i > n)
            return;
        printTill0(i+1,n);
        System.out.println(i);
    }
}
