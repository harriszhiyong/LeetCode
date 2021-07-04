package codeinginterview.offer_50;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        char res = ' ';
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                res = key;
                break;
            }
        }
        return res;
    }
}
