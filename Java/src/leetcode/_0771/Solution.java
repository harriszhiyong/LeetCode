package leetcode._0771;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (int i = 0; i < jewels.length(); i++) {
           int length = stones.length();
           stones = stones.replaceAll(jewels.charAt(i) + "", "");
           res += length - stones.length();
       }
        return res;
    }
}
