package leetcode._0239;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, 3)));
    }
}
