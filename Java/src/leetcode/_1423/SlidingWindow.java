package leetcode._1423;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static void main(String[] args) {
       // int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int[] cardPoints = {2, 2, 2};
        System.out.println(maxScore(cardPoints, 3));
    }
    public static int maxScore(int[] cardPoints, int k) {
       int sum = 0;

       for (int carPoint : cardPoints) {
           sum += carPoint;
       }
        int n = cardPoints.length;
       if (k == n) {
           return sum;
       }
       int minSum = Integer.MAX_VALUE;
       int tempMinSum = 0;

        Deque<Integer> deque = new LinkedList<>();
       for (int i = 0; i < n; i++) {

           tempMinSum += cardPoints[i];
           deque.offer(cardPoints[i]);
           if (deque.size() == n - k ) {
               minSum = Math.min(minSum, tempMinSum);
               tempMinSum = tempMinSum - deque.poll();
           }
       }
       return  sum - minSum;
    }
}
