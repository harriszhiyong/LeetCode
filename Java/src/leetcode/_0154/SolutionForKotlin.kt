package leetcode._0154

class SolutionForKotlin {
    fun findMin(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        for (i in nums.indices) {
            min = min.coerceAtMost(nums[i])
        }
        return min
    }
}