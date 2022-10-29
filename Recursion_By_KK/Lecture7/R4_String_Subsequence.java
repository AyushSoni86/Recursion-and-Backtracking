package Recursion_By_KK.Lecture7;

import java.util.ArrayList;

public class R4_String_Subsequence {
    public static void main(String[] args) {
//        subSeq("abc", "");
        System.out.println(subSeqRet("abcd",""));
    }

    static void subSeq(String str, String p) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        subSeq(str.substring(1), p + str.charAt(0));
        subSeq(str.substring(1), p);
    }

    static ArrayList<String> subSeqRet(String str, String p) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list1 = subSeqRet(str.substring(1), p + str.charAt(0));
        ArrayList<String> list2 = subSeqRet(str.substring(1), p);
        list1.addAll(list2);
        return list1;
    }
}
