package leetcode._0080

class SolutionForKotlin {
    fun removeDuplicates(nums: IntArray): Int {
       var n = nums.size
        if (n <= 2) {
            return n
        }
        var index = 0
        var i = 0
        while (i < n) {
            if (i > n - 3 || nums[i] != nums[i + 2])
                nums[index++] = nums[i]
            i++
        }
        return index
    }
}