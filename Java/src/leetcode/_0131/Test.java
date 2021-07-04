package leetcode._0131;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s = "aab";
        Solution solution = new Solution();
        List<List<String>> allRes = solution.partition(s);
        for (List<String> res : allRes) {
            for (String str : res) {
                System.out.println(str);
            }
        }
    }
}
