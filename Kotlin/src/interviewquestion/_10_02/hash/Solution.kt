package interviewquestion._10_02.hash

import java.util.HashMap
import java.lang.StringBuffer
import java.util.ArrayList

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map: MutableMap<String, MutableList<String>> = HashMap()
        for (str in strs) {
            val counts = IntArray(26)
            val length = str.length
            for (i in 0 until length) {
                counts[str[i] - 'a']++
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            val sb = StringBuffer()
            for (i in 0..25) {
                if (counts[i] != 0) {
                    sb.append(('a'.toInt() + i).toChar())
                    sb.append(counts[i])
                }
            }
            val key = sb.toString()
            val list = map.getOrDefault(key, ArrayList())
            list.add(str)
            map[key] = list
        }
        return ArrayList<List<String>>(map.values)
    }
}