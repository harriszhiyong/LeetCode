package leetcode._0781

class Solution {
    fun numRabbits(answers: Array<Int>): Int {
        if (answers == null|| answers.isEmpty()) {
            return 0
        }

        var map : HashMap<Int, Int> = HashMap()
        var res = 0
        answers.forEach { i ->
           if (i == 0) {
               res++
           } else if (!map.containsKey(i)) {
               res += (1 + i)
               map[i] = i
           } else {
               map[i] = map[i]!! - 1
               if (map[i] == 0) {
                   map.remove(i)
               }
           }
        }
        return res
    }
}