package leetcode._1790;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                if (s1.length() <= 2) {
                    return false;
                }
                if (chars.size() == 4) {
                    return false;
                }
                chars.add(c1);
                chars.add(c2);
            }
        }
        int left = 0;
        int right = chars.size() - 1;

        while (left < right) {
            if (chars.get(left) != chars.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
