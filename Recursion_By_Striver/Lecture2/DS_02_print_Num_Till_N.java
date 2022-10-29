package Recursion_By_Striver.Lecture2;

public class DS_02_print_Num_Till_N {
    public static void main(String[] args) {
        printNum(1,10);
    }

    static void printNum(int i ,int n){
        if (i==n)return;
        System.out.println(i);
        printNum(i+1,n);
    }
}
