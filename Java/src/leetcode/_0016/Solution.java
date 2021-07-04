package leetcode._0016;


import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int temp = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length -1 ;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                } else if (sum > target){
                    if (temp > Math.abs(sum - target)) {
                        temp = Math.abs(sum - target);
                        res = sum;
                    }
                    right--;
                } else {
                    if (temp > Math.abs(sum - target)) {
                        temp = Math.abs(sum - target);
                        res = sum;
                    }
                    left++;
                }
            }
        }
        return res;
    }
}
