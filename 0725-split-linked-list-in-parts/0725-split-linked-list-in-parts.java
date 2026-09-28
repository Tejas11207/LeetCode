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
    public ListNode[] splitListToParts(ListNode head, int k) {

        // ans ko array me return krna hain toh bss voh krna hain

        ListNode[] ans = new ListNode[k];

        // find out the length
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len ++;
            temp = temp.next ;

        }

        //constrain 
        // which is given in the question 
        //like len/k for base case or sublit
        //
        // len % k  for reamaning sublist 
        int baseSize = (len / k);
        int extraNode = (len % k);

        // main logic 

        ListNode prev = null;
        ListNode curr = head;
        
        for(int part = 0 ; part < k ;part ++){
            // dimaag lagne vala point 
            if(curr == null){
                // to mere pass kuch hain hie nhi 
                // main null ko hie store krdunga 
                ans[part] = curr ;
                continue ;
            }

            // insert curr into array 
            ans[part] = curr;

            // find width of the current sublist
            int  width = baseSize + (extraNode >0 ? 1 : 0);

            // extraNode ko decrement kro 
            extraNode --;

            
            for(int i = 1 ; i<=width ; i++){
                prev = curr;
                curr= curr.next ;

            }

            prev.next = null;
            // now we will move to new itration 
            prev = null;





        }

        return ans;



        
    }
}