package leetcode._0206;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        node.next.next = node;
        node.next = null;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
