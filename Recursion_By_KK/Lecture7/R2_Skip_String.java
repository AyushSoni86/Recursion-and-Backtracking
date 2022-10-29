package Recursion_By_KK.Lecture7;

public class R2_Skip_String {
    public static void main(String[] args) {
        System.out.println(skip("hello bro hii bro", " bro"));
        skip("hello bro hii bro","", " bro");
    }

    static String skip(String str, String r) {
        if (str.isEmpty()) return "";
        if (str.startsWith(r)) return skip(str.substring(r.length()), r);
        else return str.charAt(0) + skip(str.substring(1), r);
    }

    static void skip(String str, String p, String rem) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        if (str.startsWith(rem)) skip(str.substring(rem.length()), p, rem);
        else skip(str.substring(1), p + str.charAt(0), rem);
    }
}
