package leetcode._1143



class Solution {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        var res = 0
        var start = 0

        for (i in text1.indices) {
            if (text1[i] != text2[i]) start = i
            res = (i - start + 1).coerceAtLeast(res)
            if (i + 1 == text1.length || i + 1 == text2.length) {
                break
            }

        }
        return 0
    }
}