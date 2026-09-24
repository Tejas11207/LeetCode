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

        int carry = 0;

        // dummy node 

        ListNode ansHead = new ListNode(-1);
        ListNode ansTail = ansHead;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = 0;

            // check kr ki list 1 toh empty nhi
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next; // agge kiya

            }
            //same as list 2
            if (l2 != null) {
                sum = sum + l2.val;

                l2 = l2.next;  //aage kiya

            }

            sum = sum + carry;

            int digit = sum %10;

            ListNode newNode= new ListNode(digit);  // dummy ke aander inster krne ke liye new node create ki

            ansTail.next= newNode; // dummmy node me insert kiya 
            ansTail = newNode;


            carry = sum/10; // if there is any carry hain yaa nhi 



        }
        // change the head of the dummy node

        ansHead= ansHead.next; 

        return ansHead; // return 


    }
}