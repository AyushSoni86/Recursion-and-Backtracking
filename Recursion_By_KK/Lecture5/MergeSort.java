package Recursion_By_KK.Lecture5;

import java.util.Arrays;
import java.util.Random;

import static Recursion_By_KK.Lecture5.Merge_Sort_Algorithm.isSorted;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    static void merge(int[] arr, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] ans = new int[high + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) ans[k++] = arr[i++];
            else ans[k++] = arr[j++];
        }
        while (i <= mid) ans[k++] = arr[i++];
        while (j <= high) ans[k++] = arr[j++];

        for (int l = low; l <= high; l++) {
            arr[l] = ans[l];
        }
//        for (int l = 0, si = low; l < ans.length-1; l++,si++) {
//            arr[si] = ans[l];
//        }
    }
}
