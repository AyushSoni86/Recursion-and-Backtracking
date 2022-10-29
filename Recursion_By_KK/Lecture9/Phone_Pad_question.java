package Recursion_By_KK.Lecture9;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Phone_Pad_question {
    public static void main(String[] args) {
//        print("12", "");
        System.out.println(phonePad("12",""));
    }

    static void print(String str, String p) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = str.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) (i + 'a');
            print(str.substring(1), p + ch);
        }
    }

    static ArrayList<String> phonePad(String str, String p) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = str.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) (i + 'a');
            ans.addAll(phonePad(str.substring(1), p + ch));
        }
        return ans;

    }
}
