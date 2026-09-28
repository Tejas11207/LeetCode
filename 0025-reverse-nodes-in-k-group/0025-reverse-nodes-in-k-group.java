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
    public ListNode reverseKGroup(ListNode head, int k) {

        // length find kro

        int len = 0;
        ListNode temp = head;
        while(temp !=null){

            len++;
            temp= temp.next ;

        }
        if(len <k ) {// if meri length khud hie choti hain k toh mai reverse nhi kr sakta hun
          return head;
        }

    
        // first k -len  group ko reverse korna hain

        ListNode prev = null;
        ListNode curr = head;

        for(int i = 1 ; i<=k ;i++){
            ListNode forward = curr.next ;
            curr.next = prev; // curr ki next vali link ko prev krna hain

            prev = curr;
            curr = forward ;



        }
        // remaning List ko recursion se solve krwalo 
        ListNode recursionkaHead = reverseKGroup(curr , k );

        // join both the list 
        head.next = recursionkaHead;

        //LL is reversed as per ques demand ;

        return prev;
        

        
    }
}