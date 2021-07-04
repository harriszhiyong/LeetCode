package leetcode._0131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> allRes = new ArrayList<>();
        backTrack(0, 0, s.length() - 1, new ArrayList<>(), allRes, s);
        return allRes;
    }
    public void backTrack(int left, int right, int length, List<String> res, List<List<String>> allRes, String s) {

        if (right >= length) {
            allRes.add(res);
            return;
        }
        if (left >= length) {
            return;
        }
        List<String> tempRes = new ArrayList<>(res);
        if (right <= length ) {
            String str = s.substring(left, right + 1);

            if (check(str)) {
                tempRes.add(str);
                backTrack(left, right + 1, s.length() - 1, tempRes, allRes, s);
            } else {
                backTrack(left + 1, right, s.length() - 1, tempRes, allRes, s);
            }

        }

    }

    public boolean check(String s) {

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
