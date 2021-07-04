package leetcode._0124;

import util.TreeNode;

public class Solution {
    int res = -1001;
    public int maxPathSum(TreeNode root) {
        return Math.max(process(root), res);
    }

    public int process(TreeNode root) {
        if (root == null) {
            return -1001;
        }

        int left = process(root.left);
        int right = process(root.right);
        int num1 = root.val;
        int num2 = root.val + left;
        int num3 = root.val + right;
        int num4 = root.val + left + right;
        int num5 = Math.max(left, right);

        res = Math.max(res, Math.max(num4, num5));
        return Math.max(num1, Math.max(num2, num3));
    }
}
