package leetcode._0008;

public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int minus = 1;

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index >= s.length()) {
            return 0;
        }
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            minus = s.charAt(index) == '-' ? -1 : 1;
            index++;
        } else if (!(s.charAt(index) >= '0' && s.charAt(index) <= '9')) {
            return 0;
        }

        long res = 0;
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                res = res * 10 + (s.charAt(i) - '0');
            } else {
                break;
            }
            if (res > Integer.MAX_VALUE) {
                return minus == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            }
        }
        return (int)res * minus;
    }
}
