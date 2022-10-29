package Recursion_by_ApnaCollege.Class2_Questions;

public class Q5_move_char_at_end {
    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str, "", 0, 0);
    }

    static void move(String str, String p, int ind, int count) {
        if (ind == str.length()) {
            for (int i = 0; i < count; i++) {
                p += 'x';
            }
            System.out.print(p);
            return;
        }
        char ch = str.charAt(ind);
        if (ch != 'x')
            move(str, p + ch, ind + 1, count);
        else
            move(str, p, ind + 1, count + 1);

    }
}
