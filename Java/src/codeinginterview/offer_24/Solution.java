package codeinginterview.offer_24;

import util.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }
        return prev;
    }
}
