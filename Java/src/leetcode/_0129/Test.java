package leetcode._0129;

import util.TreeNode;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution sl = new Solution();
        System.out.println(sl.sumNumbers(root));
    }
}
