package leetcode._0002;


import util.ListNode;




public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode sumListNode = null;
       ListNode tempSumListNode = null;
       int carry = 0;
       while (l1 != null || l2 != null) {
           int l1Val = l1 == null ? 0 : l1.val;
           int l2Val = l2 == null ? 0 : l2.val;
           int val = (l1Val + l2Val + carry) % 10;
           carry = (l1Val + l2Val + carry) / 10;
           if (sumListNode == null) {
               sumListNode = tempSumListNode = new ListNode(val);
           } else {
               tempSumListNode.next = new ListNode(val);
               tempSumListNode = tempSumListNode.next;
           }

           if (l1 != null) {
               l1 = l1.next;
           }

           if (l2 != null) {
               l2 = l2.next;
           }
       }
       if (carry != 0) {
           tempSumListNode.next = new ListNode(carry);
           tempSumListNode = tempSumListNode.next;
       }
       return sumListNode;
    }
}

