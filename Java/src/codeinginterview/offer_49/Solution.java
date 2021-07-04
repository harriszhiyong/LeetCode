package codeinginterview.offer_49;

public class Solution {
    public int nthUglyNumber(int n) {
        int res = 0;
        int num = 1;
        for (int i = 0; i < n ; num++) {
            if (num == 1) {
                i++;
                continue;
            }

            if ((num % 2 ==0 && num % 3 != 0 && num % 5 != 0) || (num % 2 != 0 && num % 3 == 0 && num % 5 != 0)
            || (num % 2 != 0 && num % 3 != 0 && num % 5 == 0)) {
                i++;
                continue;
            }

            if (i + 1 == n) {
                res = i;
                i++;
            }
        }
        return res;
    }
}
