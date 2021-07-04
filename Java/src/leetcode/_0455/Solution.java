package leetcode._0455;

import java.util.Arrays;


public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int i = 0, j = 0;
        while (i < g.length  && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                res++;
            } else {
                j++;
            }
        }
        return res;
    }
}
