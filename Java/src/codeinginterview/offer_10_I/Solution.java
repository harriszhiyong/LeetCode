package codeinginterview.offer_10_I;

public class Solution {

    public int fib(int n) {
        long[] nums = new long[n + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = 1;
                continue;
            }

            if (i == 1) {
                nums[i] = 2;
                continue;
            }

            nums[i] = (nums[i - 1] + nums[i - 2]) % 1000000007;;
        }
        return (int)nums[n - 1];
    }
}
