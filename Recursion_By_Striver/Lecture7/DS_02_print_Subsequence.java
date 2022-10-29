package Recursion_By_Striver.Lecture7;

import java.util.ArrayList;

public class DS_02_print_Subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,s = 0;
        int sum = 9;
        printS(arr,ans,i,s,sum);

    }



    static void printS(int[] arr, ArrayList<Integer> ans, int i, int s, int sum) {
        if (i == arr.length){
            if (s == sum){
                System.out.println(ans);
            }
            return;
        }

        ans.add(arr[i]);
        s+=arr[i];
        printS(arr,ans,i+1,s,sum);
        ans.remove(ans.size() - 1);
        s-=arr[i];
        printS(arr,ans,i+1,s,sum);
    }
}
