package leetcode._0019;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        ListNode res = solution.removeNthFromEnd(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
