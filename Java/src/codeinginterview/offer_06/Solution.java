package codeinginterview.offer_06;

import util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] reversePrint(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            System.out.println(head.val);
            deque.push(head);
            head = head.next;
        }

        int[] nums = new int[deque.size()];
        int index = 0;
        while (!deque.isEmpty()) {
            nums[index] = deque.pop().val;
            index++;
        }
        return nums;
    }
}
