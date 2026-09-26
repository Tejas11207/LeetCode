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
    public ListNode partition(ListNode head, int x) {

        ListNode lessHead = new ListNode(-1);
        ListNode lessTail = lessHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while (temp != null) {
             ListNode insertNode = temp; // globle varible 
            if (temp.val < x) {
                //less than x 
               // ListNode insertNode = temp; // local varibale
                temp = temp.next;
                insertNode.next = null;

                lessTail.next = insertNode;

                lessTail = insertNode;

            }

            else {

               

                temp = temp.next;
                insertNode.next = null;

                greaterTail.next = insertNode;

                greaterTail = insertNode;

            }
        }

        lessTail.next = greaterHead.next;
        greaterTail.next = null;

        lessHead = lessHead.next;

        return lessHead;

    }
}