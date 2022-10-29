package Recursion_By_KK.Lecture7;

import java.util.*;

public class leetcode_subseq {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int i = 0;
        solve(arr, i, new ArrayList<>(), ans);
        return ans;
    }
    private static void solve(int[] arr, int i, List<Integer> output, List<List<Integer>> ans) {

        if (i >= arr.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        solve(arr, i + 1, output, ans);
        output.add(arr[i]);
        solve(arr, i + 1, output, ans);
        output.remove(output.size()-1);

    }

    static void solve1(int[] arr, int i, List<Integer> output, List<List<Integer>> ans) {

        if (i >= arr.length) {
            ans.add(new ArrayList<>(output));
            return ;
        }
        ArrayList<Integer> aux = new ArrayList<>();
        solve1(arr, i + 1, output, ans);
        output.add(arr[i]);
        solve1(arr, i + 1, output, ans);
        output.remove(output.size()-1);

    }

}
