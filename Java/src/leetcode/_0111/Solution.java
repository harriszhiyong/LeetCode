package leetcode._0111;

import util.TreeNode;

public class Solution {

    public int minDepth(TreeNode root) {
       if (root == null) {
           return 0;
       }
       else {
           int left = minDepth(root.left) + 1;
           int right = minDepth(root.right) + 1;
           if (left == 1) {
               return right;
           } else if (right == 1) {
               return left;
           } else {
               return Math.min(left, right);
           }
       }
    }
}
