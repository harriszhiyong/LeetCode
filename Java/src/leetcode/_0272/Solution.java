package leetcode._0272;


import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");
        Deque<Integer> nums = new LinkedList<>();
        Deque<Character> chars = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                int n = s.charAt(i) - '0';
                while (i + 1 < s.length() && s.charAt(i + 1) - '0' >= 0 && s.charAt(i + 1) - '0' <= 9) {
                    n = n * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                nums.push(n);
            }

            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                chars.push(s.charAt(i));
            }

            if (s.charAt(i) == '*') {
                int n = nums.pop();
                int n1 = s.charAt(i + 1) - '0';
                i++;
                while (i + 1 < s.length() && s.charAt(i + 1) - '0' >= 0 && s.charAt(i + 1) - '0' <= 9) {
                    n1 = n1 * 10 + s.charAt(i + 1) - '0';
                    i++;
                }

                nums.push(n * n1);

            }

            if (s.charAt(i) == '/') {
                int n = nums.pop();
                int n1 = s.charAt(i + 1) - '0';
                i++;
                while (i + 1 < s.length() && s.charAt(i + 1) - '0' >= 0 && s.charAt(i + 1) - '0' <= 9) {
                    n1 = n1 * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                nums.push(n / n1);
            }
        }


        int res = 0;
        boolean fist = true;
        while (!nums.isEmpty()) {
            int num = nums.pollLast();
            if (fist) {
                res = num;
                fist = false;
                continue;
            }

            char c = chars.pollLast();
            if (c == '+') {
                res = res + num;
            } else {
                res = res - num;
            }
        }

        return res;
    }
}
