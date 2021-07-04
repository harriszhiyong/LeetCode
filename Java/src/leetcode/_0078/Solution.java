package leetcode._0078;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allRes = new ArrayList<>();
        backTrack(0, nums, allRes, new ArrayList<>());
        return allRes;
    }

    public void backTrack(int i, int[] nums, List<List<Integer>> allRes, List<Integer> res) {
        allRes.add(new ArrayList<>(res));

        for (int j = i; j < nums.length; j++) {
            res.add(nums[j]);
            backTrack(j + 1, nums, allRes, res);
            res.remove(res.size() - 1);
        }
    }
}
