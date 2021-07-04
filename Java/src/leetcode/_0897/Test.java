package leetcode._0897;

import util.TreeNode;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(3));
        Solution sl = new Solution();
        sl.increasingBST(root);
    }
}
