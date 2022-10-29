package Recursion_By_Striver.Lecture6;

import java.util.ArrayList;

public class DS_02_subsequence2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        printF(arr, ans, 0);
    }

    static void printF(int[] arr, ArrayList<Integer> ans, int i) {

        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printF(arr, ans, i + 1);
        ans.remove(ans.size() - 1);
        printF(arr, ans, i + 1);
    }
}
