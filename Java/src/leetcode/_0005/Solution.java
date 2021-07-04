package leetcode._0005;

public class Solution {
    public String longestPalindrome(String s) {
        if (s .length() <= 1) {
            return s;
        }
        int n = s.length();
        int length = 1, maxLength = 0;
        int begin = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && s.charAt(i) == s.charAt(left)) {
                left--;
                length++;
            }
            while (right < n && s.charAt(i) == s.charAt(right)) {
                right++;
                length++;
            }

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                length += 2;
            }

            if (maxLength < length) {
                maxLength = length;
                begin = left + 1;
                end = right - 1;
            }
            length = 1;
        }
        return s.substring(begin, end + 1);
    }
}
