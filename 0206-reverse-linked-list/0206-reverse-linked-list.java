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
//     public ListNode reverseList(ListNode head) {

//         ListNode last=null; // new null create kiya 
//         ListNode curr = head ;

//         while(curr != null){
//                 ListNode temp = curr.next;  // step 1 ;
//             curr.next =last;   // attact to the null point            
//             last = curr;        // null ko current kr diya             //step 3 
//             curr = temp ;    // temp ko curr and temp ko curr.next              // step 4
//         } 
//         return last;  //last n vala prevoius vala 
//     }
// }

class Solution {

        public ListNode solve(ListNode prev,ListNode curr){

            // base case ;

            if(curr == null){
                return prev;

            }

            // ek case hum solve krenge baki recursion samabal le ga 
            ListNode forward = curr.next;

            curr.next = prev;

            // ek ek step forward 

            prev= curr;
            curr= forward;

            // recursiove call 

            ListNode ans = solve(prev,curr);

            return ans ; 
        }

         public ListNode reverseList(ListNode head)
         {
             // recurvice method

             ListNode prev = null;

             ListNode curr  = head;

             ListNode ans = solve(prev,curr) ;
             return ans ;
            
            // ListNode  prev = null;
            // ListNode  curr = head;

            // while(curr !=null){

            //     ListNode forward = curr.next;

            //     curr.next = prev;
            //     prev= curr;
            //     curr= forward;

            // } 
            // return prev;
         }

}
