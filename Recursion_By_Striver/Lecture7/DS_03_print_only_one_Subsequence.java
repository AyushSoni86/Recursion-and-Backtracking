package Recursion_By_Striver.Lecture7;

import java.util.ArrayList;

public class DS_03_print_only_one_Subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> ans = new ArrayList<>();
        printS(arr,ans,0,0,6);
    }

    static boolean printS(int[] arr, ArrayList<Integer> ans, int i, int s, int sum) {
        if (i == arr.length) {
            if (s == sum) {
                System.out.println(ans);
                return true;
            } else return false;
        }
        ans.add(arr[i]);
        s += arr[i];
        if (printS(arr, ans, i + 1, s, sum)) return true;
        ans.remove(ans.size()-1);
        s -= arr[i];
        return printS(arr, ans, i + 1, s, sum);
    }
}
