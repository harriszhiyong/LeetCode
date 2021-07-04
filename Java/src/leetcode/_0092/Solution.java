package leetcode._0092;

import util.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode before = new ListNode(-1, head);
        ListNode tempBefore = before;

        for (int i = 0; i <= right; i++) {
            if (i + 1 == left) {
                tempBefore.next = null;
            } else if (i + 1 < left) {
                tempBefore = tempBefore.next;
            }

            if (i + 1 >= left && i < right) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
                continue;
            }
            if (i + 1 < right) head = head.next;
        }

        tempBefore.next = prev;
        ListNode temp = before;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return before.next;
    }
}
