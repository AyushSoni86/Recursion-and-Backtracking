package Recursion_By_KK.Lecture8;

public class Print_Permutations {
    public static void main(String[] args) {
        permutation("abc", "");
        String str = "ayush";

    }

    static void permutation(String str, String p) {
        if (str.isEmpty()) {
//            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
//            System.out.println("f" + i + "-> " + f);
            String s = p.substring(i);
            System.out.println("s" + i + "-> " + s +"    "+"f" + i + "-> " + f);
            System.out.println("t" + i + "-> " + f + ch + s);
            permutation(str.substring(1), f + ch + s);
        }
    }
}
