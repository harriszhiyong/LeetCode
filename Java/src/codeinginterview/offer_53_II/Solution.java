package codeinginterview.offer_53_II;

public class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                res = i + 1;
            }
            if (nums[i] != i) {
                res = i;
                break;
            }
        }
        return res;
    }
}
