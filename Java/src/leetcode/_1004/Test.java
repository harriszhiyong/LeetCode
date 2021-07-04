package leetcode._1004;

public class Test {
    public static void main(String[] args) {
        //int[] A = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(A, k));
    }
}
