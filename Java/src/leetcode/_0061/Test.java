package leetcode._0061;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res = solution.rotateRight(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
