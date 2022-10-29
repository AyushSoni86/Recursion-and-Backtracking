package Recursion_By_KK.Lecture10;

import java.util.ArrayList;

public class MazeProblem_returnList {
    public static void main(String[] args) {
//        System.out.println(path(4, 4, ""));
        System.out.println(pathDiagonal(3,3,""));
    }

    static ArrayList<String> path(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1)
            list.addAll(path(r - 1, c, p + 'D'));
        if (c > 1)
            list.addAll(path(r, c - 1, p + 'R'));
        return list;

    }

    static ArrayList<String> pathDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1)
            list.addAll(pathDiagonal(r - 1, c - 1, p + 'C'));
        if (r > 1)
            list.addAll(pathDiagonal(r - 1, c, p + 'D'));
        if (c > 1)
            list.addAll(pathDiagonal(r, c - 1, p + 'R'));
        return list;

    }

}
