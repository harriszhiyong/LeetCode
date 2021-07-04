package leetcode._0264;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int nthUglyNumber(int n) {
        int res = 0;
        for (int i = 0, num = 0; i < n; num++) {
            if (isUgly(num)) {
                res = num;
                i++;
            }
        }
        return res;
    }
    public boolean isUgly(int n) {
        if (n < 1) return false;
        while (n % 2 == 0) {
            n = n / 2;
            if (map.containsKey(n)){
                map.put(n, n);
                return true;
            }
        }
        while (n % 3 == 0){
            n = n / 3;
            if (map.containsKey(n)){
                map.put(n, n);
                return true;
            }
        }
        while (n % 5 == 0) {
            n = n / 5;
            if (map.containsKey(n)){
                map.put(n, n);
                return true;
            }
        }

        boolean res = n == 1 ? true : false;
        if (res) {
            map.put(n, n);
            return true;
        }
        return false;
    }
}
