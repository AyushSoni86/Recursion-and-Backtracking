package Recursion_By_KK.Lecture4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 3, 8, 9, 4, 7, 5, 6};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length  , 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int l, int max) {
        if (l == 0) return;

        if (l > i) {
            if (arr[i] > arr[max])
                sort(arr, i + 1, l, i);
            else
                sort(arr, i + 1, l, max);
        } else {
            int temp = arr[l - 1];
            arr[l - 1] = arr[max];
            arr[max] = temp;
            sort(arr, 0, l - 1, 0);
        }
    }
}
