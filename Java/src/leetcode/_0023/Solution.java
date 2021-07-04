package leetcode._0023;

import util.ListNode;
import util.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }
        ListNode dummyNode = new ListNode();
        ListNode tempNode = dummyNode;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tempNode.next = node;
            tempNode = tempNode.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        return dummyNode.next;
    }
}
