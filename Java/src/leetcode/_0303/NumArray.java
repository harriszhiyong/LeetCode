package leetcode._0303;

class NumArray {
    public int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        sumRange( 1,  3);
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for ( ; i <= j; i++) {
           if (i >= 0 && j < nums.length) {
               sum += nums[i];
           }
        }
        return sum;
    }
}
