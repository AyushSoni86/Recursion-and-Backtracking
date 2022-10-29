package Recursion_By_KK.Lecture5;

import java.util.Arrays;

public class Merge_Sort_Algorithm {
    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 5, 9, 0, 7, 8};
        int[] ans = mergeSort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
        System.out.println(isSorted(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }
        while (i < arr1.length) ans[k++] = arr1[i++];
        while (j < arr2.length) ans[k++] = arr2[j++];
        return ans;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
