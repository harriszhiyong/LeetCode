package leetcode._0154;

import java.util.Arrays;

public class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
