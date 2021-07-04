package leetcode._0503;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1, 2, 1};
//        int[] nums = {5, 4, 3, 2, 1};
        int[] nums = {1, 5, 3, 6, 8};
        int[] res = solution.nextGreaterElements(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }
}
