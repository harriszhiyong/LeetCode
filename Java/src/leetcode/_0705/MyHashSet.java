package leetcode._0705;

class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }

     public ListNode(int val) {
         this.val = val;
     }
 }
public class MyHashSet {
    public ListNode[] elem;
    int len = 1000;

    public MyHashSet() {
        this.elem = new ListNode[1000];
    }

    public void add(int key) {
        int index = key % len;
        if (elem[index] == null) {
            elem[index] = new ListNode(key);
            return;
        }

        ListNode node = elem[index];
        while (node.next != null) {
            if (node.val == key) {
                return;
            }
            node = node.next;
        }

        if (node.val == key) {
            return;
        }
        node.next = new ListNode(key);
    }

    public void remove(int key) {
        int index = key % len;
        ListNode node = elem[index];
        ListNode prev = null;
        while (node != null) {
            if (node.val == key) {
                if (prev == null) {
                    elem[index] = elem[index].next;
                } else {
                    prev.next = node.next;
                }
                return;
            } else {
                prev = node;
                node = node.next;
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int index = key % len;

        ListNode node = elem[index];
        while (node != null) {
            if (node.val == key) {
                return true;
            }
            node = node.next;
        }
        return false;
    }


}
