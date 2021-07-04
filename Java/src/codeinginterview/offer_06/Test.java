package codeinginterview.offer_06;

import util.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(2)));
        Solution solution = new Solution();
        for (int num : solution.reversePrint(head)) {
            System.out.println(num);
        }
    }
}
