package Leetcoe._1743.hash

import java.util.ArrayList
import java.util.HashMap

class Solution {
    fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
        val map: MutableMap<Int, MutableList<Int>> = HashMap()
        for (adjacentPair in adjacentPairs) {
            map.putIfAbsent(adjacentPair[0], ArrayList())
            map.putIfAbsent(adjacentPair[1], ArrayList())
            map[adjacentPair[0]]!!.add(adjacentPair[1])
            map[adjacentPair[1]]!!.add(adjacentPair[0])
        }
        val n = adjacentPairs.size + 1
        val ret = IntArray(n)
        for ((e, adj) in map) {
            if (adj.size == 1) {
                ret[0] = e
                break
            }
        }
        ret[1] = map[ret[0]]!![0]
        for (i in 2 until n) {
            val adj: List<Int> = map[ret[i - 1]]!!
            ret[i] = if (ret[i - 2] == adj[0]) adj[1] else adj[0]
        }
        return ret
    }
}