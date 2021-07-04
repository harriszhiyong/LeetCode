package leetcode._0239;


import java.util.LinkedList;



public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;

        LinkedList<Integer> queue = new LinkedList<>();

        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() &&nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
        }
        return null;
    }
}
