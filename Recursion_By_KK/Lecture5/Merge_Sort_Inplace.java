package Recursion_By_KK.Lecture5;

import java.util.Arrays;

import static Recursion_By_KK.Lecture5.Merge_Sort_Algorithm.isSorted;

public class Merge_Sort_Inplace {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 7, 8, 9, 1, 5, 6, 8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
    }

    static void mergeSort(int[] arr, int i, int l) {
        if (l - i == 1) return;
        int mid = i + (l - i) / 2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid , l);
        merge(arr, i, l, mid);
    }

    static void merge(int[] arr, int start, int end, int mid) {
        int[] ans = new int[end - start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) ans[k++] = arr[i++];
            else ans[k++] = arr[j++];
        }
        while (i < mid) ans[k++] = arr[i++];
        while (j < end) ans[k++] = arr[j++];
        for (int l = 0; l < ans.length; l++) {
            arr[start+l] = ans[l];
        }
    }
}
