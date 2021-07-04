package leetcode._0045;

public class Solution {
    public int jump(int[] nums) {
        int k = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                
            }
            k = Math.max(k, i + nums[i]);
        }
        return res;
    }
}
