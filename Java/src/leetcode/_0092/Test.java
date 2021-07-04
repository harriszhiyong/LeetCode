package leetcode._0092;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        head = solution.reverseBetween(head, 2, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
