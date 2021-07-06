package Leetcoe._0001

import java.lang.RuntimeException

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            println(i)
            if (map.containsKey(target - nums[i]) ) {
                var i1: Int = map[target - nums[i]]!!
                var res: IntArray = IntArray(2)
                res[0] = i
                res[1] = i1
                return res
            } else {
                map[nums[i]] = i
            }
        }
        throw RuntimeException("")
    }
}