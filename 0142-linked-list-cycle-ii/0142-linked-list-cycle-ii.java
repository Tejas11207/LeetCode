/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        Boolean checkMeet= false;

        // detect the cycle 

        while(fast !=null){
            fast = fast.next;

            if(fast !=null){
                fast= fast.next ;
                slow = slow.next;

            }

            // cycle detect krne  hain 
            if( fast == slow ){

                checkMeet= true;
                break;

            }
        }

        // if koi cycle nhi hain toh same return false ;

        if(checkMeet ==false ){
            return null;
        }

        
        // now mujhe cycle mil gaye hain  and fast and slow dono ek point pe meet kr gaye 
        // fast ko mai jaha tha vahi chood deta hun 
        // slow  = head; wapas se 
        slow = head;

        // abe ye mera dusra loop  hain 
        // jo tb tk chalega jab tk fast and slow meet nhi kr te
        // then mene fast and slow  ko ek ek step aage kiya 
        // so voh dono apne aap meet kr jayenge starting node pe 
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;

        }

        // ek varible create kiya starting node ka 
        ListNode startingNode = slow ;  // slow ki jayga fast ko rakh skta hun

        // ab mera sb hochuka hain so return the startingNode
        return startingNode;

        
    }
}