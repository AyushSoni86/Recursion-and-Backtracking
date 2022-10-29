package Recursion_By_KK.Lecture6;

import java.util.Arrays;
import java.util.Random;

import static Recursion_By_KK.Lecture5.Merge_Sort_Algorithm.isSorted;

public class QuickSort_GFG {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = pivotInd(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int pivotInd(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
