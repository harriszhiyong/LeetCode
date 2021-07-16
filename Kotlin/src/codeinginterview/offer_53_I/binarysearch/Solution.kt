package codeinginterview.offer_53_I.binarysearch

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        var res = 0
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (nums[mid] == target) {
                res++
                var left = mid
                var right = mid
                while (left > 0 && nums[left - 1] == nums[mid]) {
                    left--
                    res++
                }
                while (right < nums.size - 1 && nums[right + 1] == nums[mid]) {
                    right++
                    res++
                }
                break
            } else if (nums[mid] > target) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return res
    }
}