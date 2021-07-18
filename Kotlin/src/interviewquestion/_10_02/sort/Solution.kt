package interviewquestion._10_02.sort

import java.util.ArrayList
import java.util.HashMap
import java.util.Arrays

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map: MutableMap<String, MutableList<String>> = HashMap()
        for (str in strs) {
            val array = str.toCharArray()
            Arrays.sort(array)
            val key = String(array)
            val list = map.getOrDefault(key, ArrayList())
            list.add(str)
            map[key] = list
        }
        return ArrayList<List<String>>(map.values)
    }
}