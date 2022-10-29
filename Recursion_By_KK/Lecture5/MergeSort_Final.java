package Recursion_By_KK.Lecture5;

import java.util.Random;

public class MergeSort_Final {
    static void printArray(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(20);
        printArray(arr);
        sort(arr);
        printArray(arr);
        System.out.println(isSorted(arr));
    }
    static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
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
        for (int index = low; index <= high; index++) {
            arr[index] = ans[index];
        }
    }
}
