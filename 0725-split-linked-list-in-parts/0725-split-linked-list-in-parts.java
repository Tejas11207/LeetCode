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

        //create the array of list  node pointers to store k parts 
        ListNode [] parts = new ListNode[k];

        // calculate the length of the linkedList

        int len = 0;
        ListNode node = head ;

        while(node != null){
            len++;
            node = node.next;

        }
        // calulate the min
        int n = len/k ;
        int r= len%k;

        // reset the pointer for the beginning of the linkedList
        node = head;
        ListNode prev = null;

        //loop
        for(int i =0;i<k  && node !=null;i++,r--){

            //store the current node
            parts[i] = node;

            for(int j = 0;j<n +(r>0 ?1:0);j++){
                prev=node;
                node = node.next;

            }

            if(prev!=null){
                prev.next= null;
            }
        }
        // return the array of k part 
        return parts ;

    }
}