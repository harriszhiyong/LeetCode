package leetcode._0503;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
           for (int j = i; j < nums.length; j++) {
               if (nums[i] < nums[j]) {
                   res[i] = nums[j];
                   break;
               }

               if (j + 1 == nums.length) {
                   res[i] = -1;
               }

               if (i == j && b) {
                   break;
               }

               if (j + 1 == nums.length) {
                   j = -1;
                   b = true;
               }

           }
            b = false;
        }
        return res;
    }
}
