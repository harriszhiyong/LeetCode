package leetcode._0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res, 0,  0, n, "");
        return res;
    }

    public void backTrack(List<String> res, int left, int right, int max, String s) {
        if (left >= max && right >= max) {
            res.add(s);
        }

        if (left < max) {
            String s1 = s + "(";
            backTrack(res, left + 1, right, max, s1);
        }

        if (left > right) {
            String s1 = s + ")";
            backTrack(res, left, right + 1, max, s1);
        }
    }
}
