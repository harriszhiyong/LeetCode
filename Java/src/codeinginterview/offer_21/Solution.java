package codeinginterview.offer_21;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        Map<Integer,Integer> map = new HashMap<>();

        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
                continue;
            }

            if (nums[right] % 2 == 0) {
                right--;
                continue;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
