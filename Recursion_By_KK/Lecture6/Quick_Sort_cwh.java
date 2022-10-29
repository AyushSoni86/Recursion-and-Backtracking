package Recursion_By_KK.Lecture6;

import java.util.Arrays;
import java.util.Random;

public class Quick_Sort_cwh {
    public static void main(String[] args) {
        Random ramd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramd.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotInedx = partition(arr, low, high);
            sort(arr, low, pivotInedx - 1);
            sort(arr, pivotInedx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            do {
                i++;
            } while (arr[i] <= pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
