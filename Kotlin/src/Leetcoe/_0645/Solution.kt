package Leetcoe._0645

import java.util.*

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        var ans = intArrayOf(0, 0)
        var n = nums.size
        Arrays.sort(nums)
        var prev = 0
        for (i in 0 until n) {
            var curr = nums[i]
            if (curr == prev) {
                ans[0] = prev
            } else if (curr - prev > 1) {
                ans[1] = prev + 1
            }
            prev = curr
        }
        if (nums[n - 1] != n) {
            ans[1] = n
        }
        return ans
    }
}

fun main() {
    var nums = intArrayOf(1, 1)
    var sl = Solution();
    var ans = sl.findErrorNums(nums);
    print(Arrays.toString(ans))
}