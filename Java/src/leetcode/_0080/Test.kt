package leetcode._0080

class Test

fun main() {
    var solution = SolutionForKotlin()
    var nums = intArrayOf(1, 1, 1, 2, 2, 3)
    var res = solution.removeDuplicates(nums)
    println(res)
    nums.forEach { num ->
        println(num)
    }
}