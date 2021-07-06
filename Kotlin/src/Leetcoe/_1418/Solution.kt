package Leetcoe._1418

import java.util.*

internal class Solution {
    fun displayTable(orders: List<List<String>>): List<List<String>> {
        // 从订单中获取餐品名称和桌号，统计每桌点餐数量
        val nameSet: MutableSet<String> = HashSet()
        val foodsCnt: MutableMap<Int, MutableMap<String, Int>> = HashMap()
        for (order in orders) {
            nameSet.add(order[2])
            val id = order[1].toInt()
            val map = foodsCnt.getOrDefault(id, HashMap())
            map[order[2]] = map.getOrDefault(order[2], 0) + 1
            foodsCnt[id] = map
        }

        // 提取餐品名称，并按字母顺序排列
        val n = nameSet.size
        val names: MutableList<String> = ArrayList()
        for (name in nameSet) {
            names.add(name)
        }
        Collections.sort(names)

        // 提取桌号，并按餐桌桌号升序排列
        val m = foodsCnt.size
        val ids: MutableList<Int> = ArrayList()
        for (id in foodsCnt.keys) {
            ids.add(id)
        }
        Collections.sort(ids)

        // 填写点菜展示表
        val table: MutableList<List<String>> = ArrayList()
        val header: MutableList<String> = ArrayList()
        header.add("Table")
        for (name in names) {
            header.add(name)
        }
        table.add(header)
        for (i in 0 until m) {
            val id = ids[i]
            val cnt: Map<String, Int> = foodsCnt[id]!!
            val row: MutableList<String> = ArrayList()
            row.add(Integer.toString(id))
            for (j in 0 until n) {
                row.add(Integer.toString(cnt[names[j]] ?: 0))
            }
            table.add(row)
        }
        return table
    }
}