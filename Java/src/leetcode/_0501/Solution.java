package leetcode._0501;


import util.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int max = 0;
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        dfs(map, root);
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                index++;
            }
        }
        int[] res = new int[index];
        index = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                res[index] = key;
                index++;
            }
        }
        return res;
    }

    public void dfs(Map<Integer, Integer> map, TreeNode root) {
        if (root == null) {
            return;
        }

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        max = Math.max(max, map.get(root.val));
        dfs(map, root.left);
        dfs(map, root.right);
    }
}
