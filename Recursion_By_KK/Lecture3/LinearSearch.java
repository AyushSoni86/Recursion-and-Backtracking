package Recursion_By_KK.Lecture3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9, 12, 34, 32, 65, 78, 90, 32, 54, 4};
        System.out.println(find(arr, 32, 0));
        System.out.println(findlast(arr, 32, arr.length - 1));
        System.out.println(search(arr, 165, 0));
    }

    static int find(int[] arr, int key, int index) {
        if (index == arr.length - 1) return -1;
        if (arr[index] == key) return index;
        return find(arr, key, index + 1);
    }

    static int findlast(int[] arr, int key, int index) {
        if (index == -1) return -1;
        if (arr[index] == key) return index;
        return findlast(arr, key, index - 1);
    }

    static boolean search(int[] arr, int key, int index) {
        if (index == arr.length - 1) return false;
        return arr[index] == key || search(arr, key, index + 1);
    }
}
