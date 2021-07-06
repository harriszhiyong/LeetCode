package leetcode._0567;

public class Solution {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (check(s1map, s2map)) {
                return true;
            }
            s2map[s2.charAt(i) - 'a'] --;
            s2map[s2.charAt(i + s1.length()) - 'a'] ++;
        }
        return check(s1map, s2map);
    }

    public static boolean check(int[] s1map, int[] s2map) {
        for (int i = 0; i < s1map.length; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }

}
