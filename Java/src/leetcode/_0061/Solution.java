package leetcode._0061;

import util.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        int size = 0;
        while (fast != null) {
            size++;
            fast = fast.next;
        }

        k = k % size;
        if (k == 0) return head;


        fast = head;
        for (int i = 0; fast != null; i++) {
            if (i > k) {
                slow = slow.next;
            }
            fast = fast.next;
        }
        ListNode back = new ListNode(-1, slow.next);
        back = back.next;
        slow.next = null;
        ListNode temp = back;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return back;
    }
}
