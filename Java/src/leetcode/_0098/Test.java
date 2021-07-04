package leetcode._0098;

import util.TreeNode;

public class Test {
    public static void main(String[] args) {
        //TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        //TreeNode0147 root = new TreeNode(5, new TreeNode(1), new TreeNode(4
       // 4        4, new TreeNode(3), new TreeNode(6)));1
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(6,
                new TreeNode(3), new TreeNode(7)));
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(root));
    }
}
