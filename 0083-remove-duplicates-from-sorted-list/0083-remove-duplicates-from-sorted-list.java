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
    public ListNode deleteDuplicates(ListNode head) {
        
        // base case 
        if(head == null ) // pehla case linked List khali nhi hona chaahiyee 
        {
            return head ;

        }
        if( head.next == null) // linkList me single node nhhi hona chahiye 
        {
            return head ;

        }

        //>1  node case aayega
        ListNode curr = head.next; // 2 pointer aassing krliyaa 
        ListNode prev = head;      

        while(curr!=null){
            
            if(prev.val != curr.val){

                // value not equal hain toh aagye badhaoo 
                prev = prev.next;  
                curr = curr.next ;

            }
            else {

                // prev == curr 
                // if equal hai prev.next = curr.next link change kro


                prev.next  = curr.next ;
                curr = curr.next ;

        

            }

        }
        // sabb hojayee toh return head 
        return head; 

    }
}