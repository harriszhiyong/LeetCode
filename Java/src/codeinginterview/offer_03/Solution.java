package codeinginterview.offer_03;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return 0;
    }
}
