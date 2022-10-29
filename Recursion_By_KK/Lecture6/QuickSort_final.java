package Recursion_By_KK.Lecture6;

import java.util.Random;

public class QuickSort_final {
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
        quickSort(arr, low, high);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }

}
