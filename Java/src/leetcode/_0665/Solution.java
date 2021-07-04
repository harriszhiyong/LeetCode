package leetcode._0665;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
            }
            if (i + 2 < nums.length && nums[i] == nums[i + 2] + 1) {
                if (i + 2 != nums.length - 1) {
                    return false;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
