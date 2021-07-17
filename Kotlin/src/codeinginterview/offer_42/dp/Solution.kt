package codeinginterview.offer_42.dp

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var pre = 0
        var maxAns = nums[0]
        for (x in nums) {
            pre = Math.max(pre + x, x)
            maxAns = Math.max(maxAns, pre)
        }
        return maxAns
    }
}