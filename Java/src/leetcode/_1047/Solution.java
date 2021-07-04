package leetcode._1047;

public class Solution {
    public String removeDuplicates(String S) {
        int right = S.length();
        int left = 0;
        while (left < right) {
            if (left > 0 && S.charAt(left) == S.charAt(left - 1)) {
                S = S.replace(S.charAt(left) + "" + S.charAt(left - 1), "");
                left = 0;
                right = S.length();
                continue;
            }
            left++;
        }
        return S;
    }
}
