package Recursion_By_Striver.Lecture4;

public class DS_02_palindrome_String {
    public static void main(String[] args) {
        String str = "ABACABA";
        System.out.println(isPalindrome(str, 0));
    }

    static boolean isPalindrome(String str, int i){
        if (i > str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalindrome(str,i+1);
    }
}
