//Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode a1 = l1, a2 = l2, curr=res;
        int carryOver = 0;
        while (a1 != null || a2!=null){
            int val1 = (a1!=null) ? a1.val:0;
            int val2 = (a2 != null) ? a2.val:0;
            int sum = val1 + val2 + carryOver;
            carryOver = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            //Incrementing the nodes
            if(a1!=null)
                a1 = a1.next;
            if(a2!=null)
                a2 = a2.next;
        }
        if(carryOver>0){
            curr.next = new ListNode(carryOver);
        }
        return res.next;
    }
}
