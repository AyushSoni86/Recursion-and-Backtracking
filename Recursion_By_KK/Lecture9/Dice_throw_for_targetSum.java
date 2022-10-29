package Recursion_By_KK.Lecture9;

import java.util.ArrayList;
import java.util.Arrays;

public class Dice_throw_for_targetSum {
    public static void main(String[] args) {
//        dice("", 5);
        ArrayList<String> ans = diceThrow("", 4);
        System.out.println(ans);
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceThrow(String str, int target) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(str);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceThrow(str + i, target - i));
        }
        return list;
    }


    static ArrayList<String> diceThrowKsides(String str, int target, int k  ) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(str);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= k && i <= target; i++) {
            list.addAll(diceThrowKsides(str + i, target - i, k));
        }
        return list;
    }
}
