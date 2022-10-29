package Recursion_by_ApnaCollege.Class2_Questions;

public class Q3_first_and_last_occurence {
    static int first = -1;
    static int last = -1;


    static void occurence(String str, char ch, int ind) {
        if (ind == str.length()) {
            System.out.println(first + " " + last);
            return;
        }
        if (str.charAt(ind) == ch) {
            if (first == -1)
                first = ind;
            else
                last = ind;
        }
            occurence(str,ch,ind+1);

    }
    public static void main(String[] args) {
        String str = "abbaadab";
        occurence(str,'a',0);
    }
}
