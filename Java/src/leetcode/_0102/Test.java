package leetcode._0102;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(9), new TreeNode(20,
                new TreeNode(15), new TreeNode(7)));
        Solution sl = new Solution();
        List<List<Integer>> allRes = new ArrayList<>(sl.levelOrder(root));
        for (List<Integer> res : allRes) {
            for (int num : res) {
                System.out.printf("%d ", num);
            }
            System.out.printf("\n");
        }
    }
}
