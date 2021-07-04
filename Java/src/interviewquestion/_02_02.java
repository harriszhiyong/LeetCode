package interviewquestion;

import util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class _02_02 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(kthToLast(head, 2));
    }

    public static int kthToLast(ListNode head, int k) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.offer(head);
            head = head.next;
        }

        for (int i = 0; i < k - 1; i++) {
            deque.pollLast();
        }

        return deque.peekLast().val;
    }
}
