package leetcode._0139;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        for (int i = 0; i < wordDict.size(); i++) {
            int len = s.length();
            String temp = s;
            s = s.replaceFirst(wordDict.get(i), "");
            if (len == s.length()) {
                return false;
            }

            s = temp;
        }
        return true;
    }
}
