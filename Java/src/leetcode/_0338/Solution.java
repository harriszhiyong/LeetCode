package leetcode._0338;

public class Solution {
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }

}
