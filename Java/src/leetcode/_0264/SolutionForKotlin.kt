package leetcode._0264

class SolutionForKotlin {
    fun nthUglyNumber(n: Int): Int {
        var res = 1
        var N = n
        while (N > 1) {
            res++
           if (isUgly(res)) {
               N--
           }
        }
        return res
    }

    fun isUgly(n: Int): Boolean {
        if (n < 1) return false
        var a = n
        while (a % 2 == 0) a /= 2
        while (a % 3 == 0) a /= 3
        while (a % 5 == 0) a /= 5
        return a == 1
    }
}