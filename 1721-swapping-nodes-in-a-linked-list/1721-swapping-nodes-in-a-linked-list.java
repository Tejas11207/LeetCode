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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        for(int i =1 ; i<= k-1 ; i++){

            first = first.next ;
            // first -> k th distacne from the start 
        }

        ListNode temp = first.next;
        ListNode sec= head;
        // ab iss window ko aage badhao
        while(temp != null){

            temp = temp.next ;
            sec = sec.next ;

        }
        // ab mera temp null pe hain , toh iisska matlb mera sec 
        // sec vala element mujhe milgya hai 
        // from the k th distance 

        // swap the value
        int tempValue = first.val;
        first.val = sec.val;
        sec.val = tempValue ;

        // return the modified head;
        
        return head;

        
    }
}