package leetcode._0141;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Hash {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head.next)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
