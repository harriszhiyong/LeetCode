package Leetcoe._0726

import java.util.Deque
import java.util.LinkedList
import java.util.HashMap
import java.util.TreeMap
import java.lang.StringBuffer

internal class Solution {
    var i = 0
    var n = 0
    var formula: String? = null
    fun countOfAtoms(formula: String): String {
        i = 0
        n = formula.length
        this.formula = formula
        val stack: Deque<MutableMap<String, Int>> = LinkedList()
        stack.push(HashMap())
        while (i < n) {
            val ch = formula[i]
            if (ch == '(') {
                i++
                stack.push(HashMap()) // 将一个空的哈希表压入栈中，准备统计括号内的原子数量
            } else if (ch == ')') {
                i++
                val num = parseNum() // 括号右侧数字
                val popMap: Map<String, Int> = stack.pop() // 弹出括号内的原子数量
                val topMap = stack.peek()
                for ((atom, v) in popMap) {
                    topMap[atom] = topMap.getOrDefault(atom, 0) + v * num // 将括号内的原子数量乘上 num，加到上一层的原子数量中
                }
            } else {
                val atom = parseAtom()
                val num = parseNum()
                val topMap = stack.peek()
                topMap[atom] = topMap.getOrDefault(atom, 0) + num // 统计原子数量
            }
        }
        val map: Map<String, Int> = stack.pop()
        val treeMap = TreeMap(map)
        val sb = StringBuffer()
        for ((atom, count) in treeMap) {
            sb.append(atom)
            if (count > 1) {
                sb.append(count)
            }
        }
        return sb.toString()
    }

    fun parseAtom(): String {
        val sb = StringBuffer()
        sb.append(formula!![i++]) // 扫描首字母
        while (i < n && Character.isLowerCase(formula!![i])) {
            sb.append(formula!![i++]) // 扫描首字母后的小写字母
        }
        return sb.toString()
    }

    fun parseNum(): Int {
        if (i == n || !Character.isDigit(formula!![i])) {
            return 1 // 不是数字，视作 1
        }
        var num = 0
        while (i < n && Character.isDigit(formula!![i])) {
            num = num * 10 + formula!![i++].toInt() - '0'.toInt() // 扫描数字
        }
        return num
    }
}