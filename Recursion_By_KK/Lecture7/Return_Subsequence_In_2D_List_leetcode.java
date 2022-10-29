package Recursion_By_KK.Lecture7;

import java.util.*;

public class Return_Subsequence_In_2D_List_leetcode {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(arr, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void solve(int[] arr, int i, List<Integer> output, List<List<Integer>> ans) {

        if (i >= arr.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        solve(arr, i + 1, output, ans);
        output.add(arr[i]);
        solve(arr, i + 1, output, ans);
        output.remove(output.size() - 1);

    }

}
