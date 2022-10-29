package Recursion_By_Striver.Backtracking;

public class DS_01_print_till_n {
    public static void main(String[] args) {
        printNum(9, 9);
    }

    static void printNum(int i ,int n){
        if (i < 0)
            return;
        printNum(i-1,n);
        System.out.println(i);
    }
}
