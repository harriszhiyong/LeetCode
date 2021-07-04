package leetcode._0150;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //String[] tokens = {"2", "1", "+", "3", "*"};
        //String[] tokens = {"4", "13", "5", "/", "+"};
        String[] tokens = {"4", "3", "-"};
        System.out.println(solution.evalRPN(tokens));
    }
}
