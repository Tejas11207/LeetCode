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
    public ListNode oddEvenList(ListNode head) {

            //mujhe node ko re arrange krna hainnn  in terms of there  odd even condtion

        // pehle base case handel kr diyaa 
        if(head ==null){
            return head;

        }
        if(head.next ==null){
            return head;

        }

        //>1 node case ;
        
        // varible assigne kr diye 

        ListNode oddHead = head;
        ListNode oddTail= head ;
        ListNode evenHead= head.next;
        ListNode evenTail = head.next;

        //while(conditions  even tail  mera null pe hi aaye gaa .... even tail.next me null ka add store)

        // eventail.next hain yee oddTail ke condition hain jo ki humne loop me change ki hai but 
        // code fattt naa isliye humne eventail.next == oddTail ka adddr . hain where humko oddtail itration ke null pe toh nhi voh bateyega
        while(evenTail!=null && evenTail.next !=null){

            oddTail.next = evenTail.next;   // linkchange kiye 

            oddTail = evenTail.next;   // assinge that linkchange value 

            evenTail.next = oddTail.next ;  // again link change 
            evenTail=oddTail.next;     //assigne that value 

        }

        // connect tails 

        oddTail.next=evenHead; 


        // return head od the modified ll

        return oddHead;

        
        
    }
}