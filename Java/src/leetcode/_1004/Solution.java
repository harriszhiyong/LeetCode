package leetcode._1004;

public class Solution {
    public int longestOnes(int[] A, int K) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        while (right < A.length) {
            zeroCount += 1 - A[right];
            if (zeroCount > K)
                zeroCount -= 1 - A[left++];
            right++;
        }
        return right - left;
    }
}
