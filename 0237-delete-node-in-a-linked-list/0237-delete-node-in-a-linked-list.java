/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        // ListNode  prev = node ;
        // ListNode curr = node ;

        // ListNode  forward = curr.next ;

        // for(int i =1 ; i<=node -2 ;i++){

        //     curr = curr.next;

        // }

        // prev.next = forward ;

        // curr.next= null;

        //return node

        // values. ko copy krnaa 
        // eg 4->5->1->9->null.  delete 5


        node.val = node.next.val;  // duplicate value create  4->1->1->9->null. // 5 ko  memory se hata diya 
        // bawkuff bana diya 
        // same value create ki then humne next same value value ko delete kra 

        node.next = node.next.next; // then link change  node.next = node.next.next  // link change 







        
      
        
    }
}