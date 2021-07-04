package leetcode._0015;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Solution sl = new Solution();
        List<List<Integer>> res = new ArrayList<>(sl.threeSum(nums));

        for (List<Integer> list : res) {
            for (int num : list) {
                System.out.printf("%d ", num);
            }
            System.out.printf("\n");
        }
    }
}
