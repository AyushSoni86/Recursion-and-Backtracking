package Recursion_By_KK.Lecture5;

import java.util.Arrays;
import java.util.Random;

import static Recursion_By_KK.Lecture5.Merge_Sort_Algorithm.isSorted;

public class MergeSort_CWH {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 5, 7, 9, 6, 5};
        Random rand = new Random();
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(arr1));
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(isSorted(arr1));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    private static void merge(int[] arr, int low, int mid, int high) {
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
    }
}
