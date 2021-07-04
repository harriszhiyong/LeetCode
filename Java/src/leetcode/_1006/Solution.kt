package leetcode._1006

import java.util.*

class Solution {
    fun clumsy(N: Int): Int {
        var stack0 = LinkedList<Int>()
        var stack1 = LinkedList<Char>()
        var flg = 1
        for (i in N downTo 1) {
            if (i == N) {
                stack0.push(i)
            } else if (flg == 1) {
                stack0.push(stack0.pop() * i)
                flg++
            } else if (flg == 2) {
                stack0.push(stack0.pop() / i)
                flg++
            } else if (flg == 3) {
                stack0.push(i)
                stack1.push('+')
                flg++
            } else if (flg == 4) {
                stack0.push(i)
                stack1.push('-')
                flg++
            }
            if (flg > 4) flg = 1
        }
        var res = stack0.pollLast()
        while(!stack0.isEmpty()) {
            if (stack1.pollLast() == '+') {
                res += stack0.pollLast()
            } else {
                res -= stack0.pollLast()
            }
        }
        return res
    }
}