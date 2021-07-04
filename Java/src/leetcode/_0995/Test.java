package leetcode._0995;

public class Test {
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 0, 1, 1, 0};
        int k = 3;
        SlidingWindow slidingWindow = new SlidingWindow();
        System.out.println(slidingWindow.minKBitFlips(A, k));
    }
}
