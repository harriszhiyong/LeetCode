package leetcode._0501;

import util.TreeNode;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        TreeNode root = new TreeNode(0);
        int[] res = solution.findMode(root);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
