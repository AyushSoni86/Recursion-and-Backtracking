package Recursion_By_KK.Lecture6;

import java.util.Arrays;
import java.util.Random;

public class Quick_Sort_KK {
    public static void main(String[] args) {
        Random ramd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramd.nextInt(20);
        }
        int[] arr1 = {11, 3, 0, 7, 7, 15, 6, 3, 0, 1};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int i = 0;
        int j = high - 1;
//        int mid = i+(j-i)/2;
        int pivot = arr[high];

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
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        sort(arr, low, j - 1);
        sort(arr, i + 1, high);
    }
}
