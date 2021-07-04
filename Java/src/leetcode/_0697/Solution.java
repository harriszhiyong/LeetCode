package leetcode._0697;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int du = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
            du = Math.max(du, map.get(nums[i]).size());
        }
        int ans = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key).size() == du) {
                int indexLeft = map.get(key).get(0);
                int indexRight = map.get(key).get(map.get(key).size() - 1);
                ans = Math.min(ans, indexRight - indexLeft + 1);
            }
        }

        return ans;
    }
}
