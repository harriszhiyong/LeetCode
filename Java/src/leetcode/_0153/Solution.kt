package leetcode._0153

class Solution {
    fun findMin(nums: IntArray): Int {
        var size = nums.size - 1
        var res = 0
        if (nums[0] <= nums[size]) {
            return nums[0]
        } else {
            for (i in size downTo 0) {
                if (nums[i] < nums[i - 1]) {
                    res = nums[i]
                    break
                }
            }
        }
        return res
    }
}