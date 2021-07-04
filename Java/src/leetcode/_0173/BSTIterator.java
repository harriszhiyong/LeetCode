package leetcode._0173;

import util.TreeNode;

import java.util.ArrayList;

class BSTIterator {
    public TreeNode root;
    public ArrayList<Integer> res;
    int k = 0;
    public BSTIterator(TreeNode root) {
        this.root = root;
        res = new ArrayList();
        dfs(root);
    }

    public int next() {
        return res.get(k);
    }

    public boolean hasNext() {
        return k + 1 == res.size() ? false : true;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}
