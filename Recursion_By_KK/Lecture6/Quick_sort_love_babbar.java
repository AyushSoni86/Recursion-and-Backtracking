package Recursion_By_KK.Lecture6;

import java.util.Arrays;
import java.util.Random;

public class Quick_sort_love_babbar {
    public static void main(String[] args) {
        Random ramd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramd.nextInt(10);
        }
        int[] arr1 = {9,5,2,2,2,8,7,9};
        System.out.println(Arrays.toString(arr1));
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int cnt = 0;
        int pivot = arr[low];
        for (int k = low + 1; k <= high; k++) {
            if (arr[k] <= pivot) cnt++;
        }
        int pivotIndex = cnt + low;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = temp;

        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIndex && j > pivotIndex) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }

        return pivotIndex;
    }
}
