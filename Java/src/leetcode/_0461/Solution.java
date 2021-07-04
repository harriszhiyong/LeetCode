package leetcode._0461;

public class Solution {
    public int hammingDistance(int x, int y) {
        String xStr = Integer.toBinaryString(x);
        String yStr = Integer.toBinaryString(y);

        while (!(xStr.length() == yStr.length())) {
            if (xStr.length() < yStr.length()) {
                xStr = "0" + xStr;
            } else {
                yStr = "0" + yStr;
            }
        }

        int res = 0;
        for (int i = 0; i < xStr.length(); i++) {
            if (xStr.charAt(i) != yStr.charAt(i)) {
                res++;
            }
        }

        return res;
    }
}
