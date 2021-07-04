package codeinginterview.offer_18;

import util.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0, head);
        if (head.val == val) {
            head = head.next;
        }
        while (dummyNode != null) {
            if (dummyNode.next.val == val) {
                dummyNode.next = dummyNode.next.next;
                break;
            }
            dummyNode = dummyNode.next;
        }
        return head;
    }
}
