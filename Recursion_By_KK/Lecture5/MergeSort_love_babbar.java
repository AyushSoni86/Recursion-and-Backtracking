package Recursion_By_KK.Lecture5;

import java.util.Arrays;
import java.util.Random;

public class MergeSort_love_babbar {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);
    }

    private static void merge(int[] arr, int s, int e) {
        int mid = (s + e) / 2;

        int len1 = mid - s + 1;
        int len2 = e - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int k = s;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[k++];
        }
//        k = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[k++];
        }
        k = s;
        int index1 = 0;
        int index2 = 0;

        while (index1 < len1 && index2 < len2) {
            if (first[index1] < second[index2]) arr[k++] = first[index1++];
            else arr[k++] = second[index2++];
        }
        while (index1 < len1) arr[k++] = first[index1++];
        while (index2 < len2) arr[k++] = second[index2++];
    }
}
