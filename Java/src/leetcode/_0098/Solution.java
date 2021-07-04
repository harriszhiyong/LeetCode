package leetcode._0098;

import util.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }

    public boolean check(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }
}
