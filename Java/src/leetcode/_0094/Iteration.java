package leetcode._0094;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Iteration {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        while (root != null|| !deque.isEmpty()) {
            while (root != null) {
                deque.push(root);

            }
        }
        return null;
    }
}
