package leetcode._0022;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> res = new ArrayList<>(solution.generateParenthesis(3));
        for (String s : res) {
            System.out.println(s);
        }
    }
}
