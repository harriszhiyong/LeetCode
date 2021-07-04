package leetcode._0234;

import util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.add(head);
            head = head.next;
        }

        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                break;
            }

            if (deque.pollFirst().val != deque.pollLast().val) {
                return false;
            }
        }
        return true;
    }
}
