package leetcode._0046;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> allRes = solution.permute(nums);
        for (List<Integer> res : allRes) {
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
