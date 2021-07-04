package leetcode._0083;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3)))));
        ListNode res = new Solution().deleteDuplicates(head);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
