package leetcode._0703;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        KthLargest kthLargest = new KthLargest(k, nums);

    }

    public  PriorityQueue<Integer> priorityQueue;
    public  int K;

    public KthLargest(int k, int[] nums) {
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
