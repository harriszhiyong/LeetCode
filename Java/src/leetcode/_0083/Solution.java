package leetcode._0083;

import util.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            while (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            if (temp != null) {
                temp = temp.next;
            }
        }
        return head;
    }
}
