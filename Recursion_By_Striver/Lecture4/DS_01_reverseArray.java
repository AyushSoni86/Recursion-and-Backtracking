package Recursion_By_Striver.Lecture4;

public class DS_01_reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        printArray(arr);
        reverse(arr,0,arr.length-1);
        printArray(arr);
        reverse2(arr,0);
        printArray(arr);

    }
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // using two pointers approach
    static void reverse(int[] arr, int i , int j){
        if (i >= j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr,i+1,j-1);
    }

    // using single pointer
    static void reverse2(int[] arr, int i){
        if (i > arr.length/2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse2(arr,i+1);

    }
}
