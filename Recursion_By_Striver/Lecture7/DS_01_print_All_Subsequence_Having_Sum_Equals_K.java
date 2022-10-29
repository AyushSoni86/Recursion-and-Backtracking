package Recursion_By_Striver.Lecture7;

import java.util.ArrayList;

public class DS_01_print_All_Subsequence_Having_Sum_Equals_K {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsequence(arr,ans,0,0,6);
    }

    static void printSubsequence(int[] arr,ArrayList<Integer> ans,int ind, int s,int sum){

        if (ind == arr.length){
            if (sum == s)
                System.out.println(ans);
            return;
        }

        ans.add(arr[ind]);
        s+=arr[ind];
        printSubsequence(arr,ans,ind+1, s, sum);
        ans.remove(ans.size() - 1);
        s-= arr[ind];
        printSubsequence(arr,ans,ind+1, s, sum);
    }
}
