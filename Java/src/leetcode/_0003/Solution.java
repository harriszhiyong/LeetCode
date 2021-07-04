package leetcode._0003;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int begin = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                begin = Math.max(begin, map.get(c));
            }
            res = Math.max(res,  i - begin + 1);
            map.put(c, i + 1);
        }
        return res;
    }
}
