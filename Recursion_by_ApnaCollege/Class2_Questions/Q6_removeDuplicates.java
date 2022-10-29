package Recursion_by_ApnaCollege.Class2_Questions;

public class Q6_removeDuplicates {
    public static void main(String[] args) {
        boolean[] map = new boolean[26];
        String str = "abbbbbcccceeeefdfdfdfdfdcbadabcabda";
        remove(str, "", 0, map);
    }

    static void remove(String str, String p, int ind, boolean[] map) {
        if (ind == str.length()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(ind);
        if (map[ch - 'a']) {
            remove(str, p, ind + 1, map);
        } else {
            map[ch - 'a'] = true;
            remove(str, p + ch, ind + 1, map);
        }

    }
}
