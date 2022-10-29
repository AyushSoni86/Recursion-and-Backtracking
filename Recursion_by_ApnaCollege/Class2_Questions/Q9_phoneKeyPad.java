package Recursion_by_ApnaCollege.Class2_Questions;

public class Q9_phoneKeyPad {
    public static void main(String[] args) {
//        String[] map = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        phonePad("23", "", map);
        phone("29", "");
    }

    static void phonePad(String str, String p, String[] map) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char digit = str.charAt(0);
        String mapping = map[digit - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            char ch = mapping.charAt(i);
            phonePad(str.substring(1), p + ch, map);
        }
    }

    static void phone(String str, String p) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = str.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;
        if (digit == 9) end = digit * 3 - 1;
        for (int i = start; i < end; i++) {
            char ch = (char) (i + 'a');
            phone(str.substring(1), p + ch);
        }
    }
}
