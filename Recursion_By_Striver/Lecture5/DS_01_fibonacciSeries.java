package Recursion_By_Striver.Lecture5;

public class DS_01_fibonacciSeries {
    public static void main(String[] args) {
        //  0 1 1 2 3 5 8 13 21 34 55 89
        System.out.println(fibo(10));
    }

    static int fibo(int n){
        if (n <= 1) return n;
        return fibo(n-1)+fibo(n-2);
    }

}
