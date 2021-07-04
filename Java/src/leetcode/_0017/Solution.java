package leetcode._0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0 || digits == null) {
            return res;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTrack(digits, res, 0, map, new StringBuffer());
        return res;
    }
    public void backTrack(String digits, List<String> res, int level, Map<Character, String> map,
                          StringBuffer sbf) {
        if (level == digits.length()) {
            res.add(sbf.toString());
        } else {
            char digit = digits.charAt(level);
            String letters = map.get(digit);
            int letterCount = letters.length();
            for (int i = 0; i < letterCount; i++) {
                sbf.append(letters.charAt(i));
                backTrack(digits, res, level + 1, map, sbf);
                sbf.deleteCharAt(level);
            }
        }
    }
}
