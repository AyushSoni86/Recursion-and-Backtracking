package Recursion_by_ApnaCollege.Class2_Questions;

import java.sql.Array;
import java.util.ArrayList;

public class Q2_printReverseString {
    public static void main(String[] args) {
        String str = "Ayush";
        reverse(str, str.length() - 1);
        ArrayList<Character> ans = reverseStr(str);

        for (char ch : ans) {
            System.out.print(ch);
        }
        reverse(str, ans);
    }

    static void reverse(String str, int ind) {
        if (ind == 0) {
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        reverse(str, ind - 1);
    }

    static void reverse(String str, ArrayList<Character> ans) {
        if (str.isEmpty()) {
            for (char ch : ans) {
                System.out.print(ch);
            }
            return;
        }
        ans.add(0, str.charAt(0));
        reverse(str.substring(1), ans);
    }

    static ArrayList<Character> reverseStr(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<Character> res =
                reverseStr(str.substring(1));
        res.add(str.charAt(0));
        return res;
    }
}
