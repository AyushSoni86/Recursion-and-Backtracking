package Recursion_By_Striver.Lecture6;

import java.util.ArrayList;

public class DS_01_subsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> arrayList = new ArrayList<>();
        printf(0, arrayList, arr);
        System.out.println();

    }

    static void printf(int ind, ArrayList<Integer> arrayList, int[] arr) {

        if (ind == arr.length) {
            System.out.println(arrayList);
            return;
        }
        arrayList.add(arr[ind]);
        printf(ind + 1, arrayList, arr);
        arrayList.remove(arrayList.size() - 1);
        printf(ind + 1, arrayList, arr);
    }



}

