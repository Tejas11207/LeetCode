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
// class Solution {
//     public ListNode middleNode(ListNode head) {

//         if(head==null || head.next == null) return head;
//         ListNode fast = head; 
//         ListNode slow = head;

//         while( fast !=null || fast.next !=null){

//            // fast = head.next ;

//            // fast = head.next.next ;
//             // then mai ek baar wapas check krunga ki ki mera fast null pe toh nhi aagya hai 
//             //if(fast !=null){

//                 //fast = fast.next;
//                 slow = head.next;
//                   fast = head.next.next ;

//            // }
//         }
//         // jb mai ye sb kr lunga  tb mera slow pointer middel node pe hie hoga so 
//         // return slow 

//         return slow ;
        
//     }
// }


class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode slow=head,fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}