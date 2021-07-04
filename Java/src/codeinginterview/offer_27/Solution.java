package codeinginterview.offer_27;

import util.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
