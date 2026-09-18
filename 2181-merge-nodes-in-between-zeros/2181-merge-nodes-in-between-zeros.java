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
    public ListNode mergeNodes(ListNode head) {

        // create the   varibale 
        ListNode read = head.next ; // zero se chalu ho raha hai toh read ko start kro with next node 
        ListNode write = head ;
        // wrtie pe hum new node of sum ko replce krnege 


        // challooo until null
        while(read !=null){

            // sum varible create 
            int sum =0;

            // inner loop tb tk chaluu  chalooo tb tk read.val ==0;
        
            while(read.val !=0){


                // sum ko update 
                sum = sum +read.val;
                // and read ko aage kro 
                read = read.next ;

               


            }
            // replace the write.val  to sum value ... without creating the actual  new node 
            //inplace insertion
              write.val = sum ;

            // change the link 
            // remove the node  which u do sum
              write.next = read.next;

              // read  ko aaage kro 
              read = read.next;  // 0 postion pe tha change kr ke 4 node pe lana 

                // write ki positon change kro 
              write = write .next; // eg .. 5 sum allready created then waps se  sum node chahiyue

              // baki notes me 





        }
        return head ;

        
    }
}