package leetcode._0896;

public class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.length; i++) {
            if (i > 0 && !(A[i] >= A[i - 1])) {
                inc = false;
            }

            if (i > 0 && !(A[i] <= A[i - 1])) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
