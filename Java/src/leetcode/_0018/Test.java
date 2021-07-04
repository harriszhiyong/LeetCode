package leetcode._0018;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums = {0, 0, 0,0};
        Solution sl = new Solution();
        List<List<Integer>> res = new ArrayList<>(sl.fourSum(nums, 0));
        for (List<Integer> list : res) {
            for (int num : list) {
                System.out.printf("%d ", num);
            }
            System.out.printf("\n");
        }
    }
}
