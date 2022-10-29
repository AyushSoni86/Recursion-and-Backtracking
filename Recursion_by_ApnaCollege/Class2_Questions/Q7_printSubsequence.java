package Recursion_by_ApnaCollege.Class2_Questions;

import java.util.ArrayList;

public class Q7_printSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        print(str, "");
    }

    static void print(String str, String p) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        print(str.substring(1), p + ch);
        print(str.substring(1), p);
    }
}
