package Recursion_By_KK.Lecture7;

public class R3_skipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skip("An Apple a day keeps doctor app away"));
    }

    static String skip(String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skip(str.substring(4));
        } else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}
