package leetcode._0001

class Test
fun main() {
    var time = System.currentTimeMillis()
    println(time)
    var nums: IntArray = intArrayOf(3, 2, 4)
    var solution = Solution()
    var res = solution.twoSum(nums, 6)
    println("${res[0]} ${res[1]}")
    println(time - System.currentTimeMillis())
}