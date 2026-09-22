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
    public ListNode rotateRight(ListNode head, int k) {

        // check if linkedList is empty or not 

        if(head ==null || k ==0){
            return head;

        }

        // len nikal rahe hain 
        int len = 1;
        // if me yaha pe len = 0 and && temp != null kr ta toh end jake mera loop null pe stand kr ta jo ki me nhi chata thaa 
        ListNode temp =head;


        while(temp.next !=null){

            len++;
            temp = temp.next ;

        }

        // make it circular 
        // travel kra then usske baad
        temp.next = head;

        // update the k 
        k = k%len;

        // link break krna hainn and set forward varible 
       
        temp = head;
        for(int i =1;i<=len-k-1;i++){
            temp= temp.next;    // me kth postion or link pe pocha jaha se mujhe  rotate krna hain

        }

        // forward variable set 
        ListNode forward = temp.next ;

        //link break
        temp.next =null;

        // return new head of the linkedList 

        return forward ;

        

        
    }
}