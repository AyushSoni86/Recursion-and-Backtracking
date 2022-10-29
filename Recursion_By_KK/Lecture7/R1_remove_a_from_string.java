package Recursion_By_KK.Lecture7;

public class R1_remove_a_from_string {
    public static void main(String[] args) {
        String str = "Hello hii";
        System.out.println(str);
        skip("", str, ' ');
        System.out.println(skip("HelloBro",'o'));
    }

    // approach 1
    static void skip(String p, String up, char k) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == k) skip(p, up.substring(1), k);
        else skip(p + ch, up.substring(1), k);
    }

    //approach 2
    static String skip(String str, char ch) {
        if (str.isEmpty()) return "";
        char c = str.charAt(0);
//        if (c == ch) return skip(str.substring(1), ch);
//        else return c + skip(str.substring(1), ch);
        return (c == ch) ? skip(str.substring(1), ch) : c + skip(str.substring(1), ch);
    }

}
