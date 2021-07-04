package leetcode._0026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            } else if (!(i > 0)){
                index++;
            }
        }
        return index;
    }
}
