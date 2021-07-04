package leetcode._0129;

import util.TreeNode;

public class Solution {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int res) {
        if (node == null) {
            return 0;
        }

        int sum = res  * 10 + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        } else {
            return dfs(node.left, sum) + dfs(node.right, sum);
        }
    }
}
