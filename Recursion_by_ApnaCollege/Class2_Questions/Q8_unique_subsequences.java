package Recursion_by_ApnaCollege.Class2_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q8_unique_subsequences {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> set = new LinkedHashSet<>();
        String str = "aaaa";
//        printSub(str, "", ans);
        printSub1(str,"",set);
        System.out.println(set);
    }

    static void printSub(String str, String p, ArrayList<String> ans) {
        if (str.isEmpty()) {
            if (ans.contains(p))
                return;
            else {
                System.out.println(p);
                ans.add(p);
                return;
            }
        }
        char ch = str.charAt(0);
        printSub(str.substring(1), p + ch, ans);
        printSub(str.substring(1), p, ans);
    }

    static void printSub1(String str, String p, HashSet<String> ans) {
        if (str.isEmpty()) {
            ans.add(p);
            return;
        }
        char ch = str.charAt(0);
        printSub1(str.substring(1), p + ch, ans);
        printSub1(str.substring(1), p, ans);
    }
}
