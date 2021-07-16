package codeinginterview.offer_53_I.binarysearch;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res++;
                int left = mid;
                int right = mid;
                while (left > 0 && nums[left - 1] == nums[mid]) {
                    left--;
                    res++;
                }

                while (right < nums.length - 1 && nums[right + 1] == nums[mid]) {
                    right++;
                    res++;
                }
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
