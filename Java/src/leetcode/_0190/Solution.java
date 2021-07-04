package leetcode._0190;

public class Solution {
    public int reverseBits(int n) {

        int res = 0;
        for (int i = 0; i < 32; i++) {

            res <<= 1;// res 左移一位，给 n 的最后一位留出位置
            res += n & 1;// n 和 1 与，取出 n 的最后一位，放在 res 的最后一位
            n >>= 1;// n 右移一位，把已经挪到 res 中的最后一位释放掉
        }
        return res;
        //return Integer.reverse(n);
    }

}
