/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA ==null || headB == null){
            return null;

        }

        ListNode a = headA;
        ListNode b = headB;

        while(a !=null && b != null){

            a = a.next;
            b=b.next;

        }

        if(a ==null){

            // dono list me se koi ek list badi hosakti hain  ya toh A or ya toh b

            // if b badi hain then length ko calu kro and usko a vali linked list jitna bano 
            int bExtraLen=0;

            while(b !=null){
                

                bExtraLen ++;
                b=b.next;

            }
            while(bExtraLen -->0){

                // while(bExtraLen >0){
                   //coode
                   //bExtraLen --        // ye likha hai issme
                //}
                headB = headB.next;

            }

        }
        else {

            // if a bada ho
            int aExtraLen=0;

            while(a!=null){
                aExtraLen ++;
                a=a.next;

            }
            while(aExtraLen -->0){
                headA=headA.next;

            }

        }

        // ab mere  a and b iss tarike se lage hue hain k unse start kr te hue 
        // dono list same tarfie se  same no. of nodes pe travel

        while(headA!=null && headB!=null){

            if(headA ==headB){
                return headA;
                // u can also return headB there no issue 
            }
            else {

                headA= headA.next;
                headB= headB.next;

            }

            
        }
        /// sab kuch hone ke baad mujhe kuch nhi mila toh return kro null

            return null;

        
    }
}