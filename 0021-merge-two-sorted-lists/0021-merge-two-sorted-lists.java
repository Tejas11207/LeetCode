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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
        
            ListNode dummy = new ListNode(-1);
            ListNode anshead = dummy;
            ListNode anstail= dummy;

            while(list1 !=null && list2!=null){

                if(list1.val<list2.val){
                    anstail.next = list1;
                    list1 = list1.next;
                    anstail= anstail.next ;

                }
                else {

                    // list2 <list 1 

                    anstail.next = list2;
                    list2=list2.next ;
                   anstail  =anstail.next ;
                }


            }
            // jaha pr 1 list fully consume hogyi hai ,and ek bachi hie h
            // lets say list1 fully consume nhi hui , but list 2 hogayi

            if(list1 !=null){
                anstail.next = list1;

            }
            //lest say list2 fully consume nhi hue hai , buty list1 hogayi

            if(list2 !=null){
                anstail.next = list2;

            }
            // ans pura ready hai buss dummy node ko remove krna hai 
            anshead = anshead.next ;
            dummy.next = null;



            return anshead;
            


    }
}