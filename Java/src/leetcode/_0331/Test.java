package leetcode._0331;

public class Test {
    public static void main(String[] args) {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        Solution solution = new Solution();
        System.out.println(solution.isValidSerialization(preorder));
    }
}
