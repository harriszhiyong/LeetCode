package Leetcoe._0218

import java.util.*

class Solution {
    fun getSkyline(buildings: Array<IntArray>): List<List<Int>> {
        val pq = PriorityQueue { a: IntArray, b: IntArray -> b[1] - a[1] }
        val boundaries: MutableList<Int> = ArrayList()
        for (building in buildings) {
            boundaries.add(building[0])
            boundaries.add(building[1])
        }
        Collections.sort(boundaries)
        val ret: MutableList<List<Int>> = ArrayList()
        val n = buildings.size
        var idx = 0
        for (boundary in boundaries) {
            while (idx < n && buildings[idx][0] <= boundary) {
                pq.offer(intArrayOf(buildings[idx][1], buildings[idx][2]))
                idx++
            }
            while (!pq.isEmpty() && pq.peek()[0] <= boundary) {
                pq.poll()
            }
            val maxn = if (pq.isEmpty()) 0 else pq.peek()[1]
            if (ret.size == 0 || maxn != ret[ret.size - 1][1]) {
                ret.add(Arrays.asList(boundary, maxn))
            }
        }
        return ret
    }
}