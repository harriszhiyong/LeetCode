package leetcode._0566;

public class Test {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        Solution solution = new Solution();
        for (int[] row : solution.matrixReshape(nums, r, c)) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }
            System.out.printf("\n");
        }
    }
}
