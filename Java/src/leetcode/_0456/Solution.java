package leetcode._0456;


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k > nums[i]) return true;
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                k = Math.max(k, deque.pollLast());
            }
            deque.addLast(nums[i]);
        }
        return false;
    }
}
