package Recursion_By_KK.Lecture3;

import java.util.ArrayList;

public class findAllOccurence {
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 9, 3, 8, 5, 9, 0, 7, 6, 5, 9};
        search(arr, 9, 0);
        System.out.println(ans);
//        ArrayList<Integer>
//        searchAll(arr, 9, 0, new ArrayList<>());
        System.out.println(findAll(arr,5,0));
    }

    static void search(int[] arr, int key, int i) {
        if (i == arr.length) return;
        if (arr[i] == key) ans.add(i);
        search(arr, key, i + 1);
    }

    static void searchAll(int[] arr, int key, int i, ArrayList<Integer> ans) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        if (arr[i] == key) ans.add(i);
        searchAll(arr, key, i + 1, ans);
    }

    static ArrayList<Integer> findAll(int[] arr, int key, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) return list;
        if (arr[i] == key) list.add(i);
        ArrayList<Integer> ans = findAll(arr, key, i + 1);
        list.addAll(ans);
        return list;
    }
}
