package leetcode._0680;

public class Solution {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
               boolean leftRes = false;
               boolean rightRes = false;
               if (left + 1 < chars.length) {
                   leftRes = check(chars, left + 1, right);
               }
               if (right - 1 >= 0) {
                   rightRes = check(chars, left, right - 1);
               }
               return leftRes || rightRes;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean check(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
