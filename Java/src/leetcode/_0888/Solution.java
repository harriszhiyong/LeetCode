package leetcode._0888;

import java.util.Arrays;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] A = {1, 1};
        int[] B = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(A, B)));
    }
    public  static int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> set = new java.util.HashSet<>();

        for (int a : A) {
            sumA += a;
        }
        for (int b : B) {
            sumB += b;
            set.add(b);
        }

        int diff = (sumA - sumB) / 2;
        int[] ans = new int[2];
        for (int a : A) {
            int temp = a - diff;
            if (set.contains(temp)) {
                ans[0] = a;
                ans[1] = temp;
                break;
            }
        }
        return ans;
    }
}
