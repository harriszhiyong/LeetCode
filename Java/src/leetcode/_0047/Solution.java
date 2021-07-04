package leetcode._0047;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> allRes = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return allRes;
        }
        dfs(allRes, new ArrayList<>(), nums, len, 0);
        return allRes;
    }

    public void dfs(List<List<Integer>> allRes, List<Integer> res, int[] nums, int len, int depth) {
        if (depth == len) {
            allRes.add(res);
            return;
        }

        for (int i = 0; i < len; i++) {
            List<Integer> newRes = new ArrayList<>(res);
            newRes.add(nums[i]);
            dfs(allRes, newRes, nums, len, depth + 1);
        }
    }
}
