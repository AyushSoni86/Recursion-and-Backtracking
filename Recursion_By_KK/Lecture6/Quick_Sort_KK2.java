package Recursion_By_KK.Lecture6;

import java.util.Arrays;
import java.util.Random;

import static Recursion_By_KK.Lecture5.Merge_Sort_Algorithm.isSorted;

public class Quick_Sort_KK2 {
    public static void main(String[] args) {
        Random ramd = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramd.nextInt(40);
        }
        int[] arr1 = {9,5,2,2,2,8,7,9};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
    }


    static void sort(int[] arr, int low, int hi) {
        if (low >= hi) return;
        int i = low;
        int j = hi;
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
        sort(arr, low, j);
        sort(arr, i, hi);
    }
}
