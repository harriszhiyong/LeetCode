package leetcode._0150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if (isNumber(c)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (c) {
                    case "+" :
                        res = num1 + num2;
                        stack.push(res);
                        break;
                    case "-" :
                        res = num2 - num1;
                        stack.push(res);
                        break;
                    case "*" :
                        res = num1 * num2;
                        stack.push(res);
                        break;
                    case "/" :
                        res = num2 / num1;
                        stack.push(res);
                        break;
                }
            } else {
                stack.push(Integer.valueOf(c));
            }
        }

        while (!stack.isEmpty()) {
            res = stack.pop();
        }
        return res;
    }

    public boolean isNumber(String c) {
        if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
            return true;
        }
        return false;
    }
}

