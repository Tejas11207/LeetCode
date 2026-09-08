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
    public ListNode reverseList(ListNode head) {

        ListNode last=null; // new null create kiya 
        ListNode curr = head ;

        while(curr != null){
                ListNode temp = curr.next;  // step 1 ;
            curr.next =last;   // attact to the null point            
            last = curr;        // null ko current kr diya             //step 3 
            curr = temp ;    // temp ko curr and temp ko curr.next              // step 4
        } 
        return last;  //last n vala prevoius vala 
    }
}