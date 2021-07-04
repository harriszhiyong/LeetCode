package codeinginterview.offer_18;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        Solution sl = new Solution();
        ListNode res = sl.deleteNode(head, 4);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
