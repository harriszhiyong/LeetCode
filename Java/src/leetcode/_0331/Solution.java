package leetcode._0331;

import java.util.Stack;

public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack stack = new Stack();
        String[] node = preorder.split(",");
        for (int i = 0; i < node.length; i++) {
            stack.push(node[i]);
            while (i >= 3 && node[i - 1].equals(node[i - 2].equals("#")) && !node[i - 3].equals("#")) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.push("#");
            }
        }
        return node.length == 1 && stack.pop() == "#";
    }
}
