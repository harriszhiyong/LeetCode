package leetcode._0019;

import util.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode before = dummyNode;
        ListNode after = dummyNode;
        int index = 0;
        while (true) {
            index++;
            before = before.next;
            if (before == null) {
                after.next = after.next.next;
                break;
            }

            if (index > n) {
                after = after.next;
            }

        }
        return dummyNode.next;
    }
}
