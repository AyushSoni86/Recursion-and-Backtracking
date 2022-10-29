package Recursion_By_KK.Lecture3;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 5, 0, arr.length - 1));
        System.out.println(search(arr, 6, 0, arr.length - 1));
        System.out.println(search(arr, 7, 0, arr.length - 1));
        System.out.println(search(arr, 8, 0, arr.length - 1));
        System.out.println(search(arr, 9, 0, arr.length - 1));
        System.out.println(search(arr, 1, 0, arr.length - 1));
        System.out.println(search(arr, 2, 0, arr.length - 1));
        System.out.println(search(arr, 12, 0, arr.length - 1));
        System.out.println(search(arr, 245, 0, arr.length - 1));
        System.out.println(search2(arr, 5, 0, arr.length - 1));
        System.out.println(search2(arr, 6, 0, arr.length - 1));
        System.out.println(search2(arr, 7, 0, arr.length - 1));
        System.out.println(search2(arr, 8, 0, arr.length - 1));
        System.out.println(search2(arr, 9, 0, arr.length - 1));
        System.out.println(search2(arr, 1, 0, arr.length - 1));
        System.out.println(search2(arr, 2, 0, arr.length - 1));
        System.out.println(search2(arr, 12, 0, arr.length - 1));
        System.out.println(search2(arr, 245, 0, arr.length - 1));
    }

    static int search(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid;
        if (arr[low] < arr[mid]) {
            if (key >= arr[low] && key < arr[mid])
                return search(arr, key, low, mid - 1);
            else
                return search(arr, key, mid + 1, high);
        } else {
            if (key > arr[mid] && key <= arr[high])
                return search(arr, key, mid + 1, high);
            else
                return search(arr, key, low, mid - 1);
        }
    }

    static int search2(int[] arr, int key, int low, int high) {

        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) return mid;

        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid])
                return search2(arr, key, low, mid - 1);
            else
                return search2(arr, key, mid + 1, high);
        }

        if (key >= arr[mid] && key <= arr[high])
            return search2(arr, key, mid + 1, high);

        return search2(arr, key, low, mid - 1);

    }
}
