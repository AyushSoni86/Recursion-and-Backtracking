package Recursion_By_KK.Lecture9;

import java.util.*;

public class phone_pas_leetcode {
    public static void main(String[] args) {
        System.out.println(phone("", ""));
        List<String> ans = new ArrayList<>();
        ans.clear();
    }

    static List<String> phone(String str, String p) {

        if (str.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> list = new ArrayList<>();
        int digit = str.charAt(0) - '0';
        int start = (digit - 2) * 3;
        int end = (digit - 1) * 3;
        if (digit == 7){
            end = ((digit - 1) * 3) + 1;
        }
        if (digit == 8) {
            start = ((digit - 2) * 3) + 1;
            end = ((digit - 1) * 3) + 1;
        }
        if (digit == 9) {
            start = ((digit - 2) * 3) + 1;
            end = ((digit - 1) * 3) + 2;
        }
        for (int i = start; i < end; i++) {
            char ch = (char) (i + 'a');
            list.addAll(phone(str.substring(1), p + ch));
        }
        return list;
    }
}
