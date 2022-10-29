package Recursion_By_KK.Lecture4;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 69, 3, 5, 6, 3, 0, 4, 5};
        printArr(arr);
//        sort(arr,arr.length-1,0);
        bubbleSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr, int i, int l) {
        if (l == 0) return;
        if (l > i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubbleSort(arr, i + 1, l);
        } else {
            bubbleSort(arr, 0, l - 1);
        }
    }


    static void sort(int[] arr, int l, int i) {
        if (l == 0) return;
        if (l > i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            sort(arr, l, i + 1);
        } else {
            sort(arr, l - 1, 0);
        }
    }
}
