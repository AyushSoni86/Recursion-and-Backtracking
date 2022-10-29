package Recursion_by_ApnaCollege.Class2_Questions;

public class Q4_check_if_array_isSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1])
            return false;
        return isSorted(arr, i + 1);
    }
}
