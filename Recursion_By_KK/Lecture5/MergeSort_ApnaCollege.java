package Recursion_By_KK.Lecture5;

import java.util.Arrays;

public class MergeSort_ApnaCollege {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 5, 7, 9, 6, 5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    static void merge(int[] arr, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] ans = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }
        while (i <= mid)
            ans[k++] = arr[i++];
        while (j <= high)
            ans[k++] = arr[j++];

        for (int l = 0, si = low; l < ans.length; l++,si++) {
            arr[si] = ans[l];
        }
    }
}
