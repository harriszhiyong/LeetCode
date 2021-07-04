package leetcode._0094;

import util.TreeNode;

public class Test {
    public static void main(String[] args) {
        //TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode root = new TreeNode(1, new TreeNode(2,
                new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6)));
        Recursion recursion =  new Recursion();
        for (int i : recursion.inorderTraversal(root)) {
            System.out.println(i);
        }
    }
}
