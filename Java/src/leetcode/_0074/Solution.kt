package leetcode._0074

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix == null || matrix[0].isEmpty()) {
            return false;
        }

        val m = matrix.size - 1;
        val n = matrix[0].size

        for (i in 0..m) {
            if (matrix[i][n] == target) return true
            else if (matrix[i][n] < target) continue

            for (j in n - 1 downTo  0 ) {
                if (matrix[i][j] == target) return true
            }
        }
        return false
    }
}