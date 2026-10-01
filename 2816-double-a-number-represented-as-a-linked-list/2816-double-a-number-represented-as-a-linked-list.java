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
    public ListNode rev(ListNode head){
        // reverse vala logic 
        ListNode prev = null;
        ListNode curr = head;

        while(curr !=null){
            ListNode forward = curr.next;

            curr.next = prev ;
            prev = curr;
            curr = forward;


        }
        return prev;

    }
   
    public ListNode doubleIt(ListNode head) {

        // step one - rev
        head= rev(head);

        // step 2 create the dummy LinkList says in question ;
         // and also math part;

         ListNode dummy = new ListNode(-1);
         ListNode  curr = dummy;  // dummy ka head;

         ListNode temp = head; // travelling varible 

         int carry = 0 ; // integer count varible 

         while(temp !=null){

            int value = temp.val; // jiss temp.value ko value 

            int sum = value + value + carry; //sum nikal do 

            int digit = sum %10; // digit 

            // add this node to new list
            // as question req 
            curr.next = new ListNode(digit);  //add kra Node new node me 
            curr= curr.next ;

            carry = sum/10;
            temp= temp.next;
        



         }
         // extra condition
         // check conditition 
         // where 1 vali extra node  ko add krna hain
         if(temp ==null && carry !=0){
            curr.next = new ListNode(carry);
         }


         // change dummy node

         dummy = dummy.next;

         // rev the list 
         head = rev(dummy);

         return head;





        
    }
}