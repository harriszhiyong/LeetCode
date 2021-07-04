package leetcode._0515;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }
    public void dfs(TreeNode node, List<Integer> res, int level) {
        if (node == null) {
            return;
        }

        if (res.size() == level) {
            res.add(node.val);
        } else {
            res.set(level, Math.max(node.val, res.get(level)));
        }

        dfs(node.left, res, level + 1);
        dfs(node.right, res, level + 1);
    }
}
