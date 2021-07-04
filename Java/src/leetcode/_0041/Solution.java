package leetcode._0041;

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        String s = Arrays.toString(nums);
        for (int i = 0; i < nums.length; i++) {
            if ( s.length() == s.replace(String.valueOf(nums[i]), "").length()) {
                return i;
            }
        }
        return 0;
    }
}
