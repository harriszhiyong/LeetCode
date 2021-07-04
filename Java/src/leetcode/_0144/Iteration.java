package leetcode._0144;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Iteration {
    public List<Integer> preorderTraversal(TreeNode root) {//迭代
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        while (root != null || !deque.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                deque.push(root);
                root = root.left;
            }
            root = deque.poll();
            root = root.right;
        }
        return res;
    }
}
