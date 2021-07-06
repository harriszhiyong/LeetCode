package leetcode._0703;

import java.util.PriorityQueue;

public class Solution {
    public  PriorityQueue<Integer> priorityQueue;
    public  int K;

    public void KthLargest(int k, int[] nums) {
        K = k;
        priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > K) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
