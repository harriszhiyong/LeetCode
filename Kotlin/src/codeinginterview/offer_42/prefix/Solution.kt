package codeinginterview.offer_42.prefix

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var res = nums[0]
        for (i in 1 until nums.size) {
            nums[i] += Math.max(nums[i - 1], 0)
            res = Math.max(res, nums[i])
        }
        return res
    }
}