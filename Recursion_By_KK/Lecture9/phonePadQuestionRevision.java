package Recursion_By_KK.Lecture9;

import java.util.ArrayList;

public class phonePadQuestionRevision {
    public static void main(String[] args) {
        phone("12", "");
        System.out.println(phone1("23",""));
    }

    static void phone(String str, String p) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = str.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;
        for (int i = start; i < end; i++) {
            char ch = (char) (i + 'a');
            phone(str.substring(1), p + ch);
        }
    }

    static ArrayList<String > phone1(String str, String p) {
        if (str.isEmpty()) {
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = str.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char) (i + 'a');
            ans.addAll(phone1(str.substring(1), p + ch));
        }
        return ans;
    }
}
