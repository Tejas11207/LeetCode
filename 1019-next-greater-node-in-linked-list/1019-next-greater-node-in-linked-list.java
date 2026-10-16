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
    public int[] nextLargerNodes(ListNode head) {

        //linked list ko array me convert krenge 

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next ;

        }
        //main logic 
        int n = list.size();

        int [] ans = new int[n];


        Deque<Integer> st = new ArrayDeque<>();

        for(int i =0; i<n;i++){

            // for each index , we will get the next greater element 
            // agar mera current element or i  index vala element stack k top pr jo index h , usss element ki value se bada hai , toh ,mujhe stack k top k index ki value ka answer 
            //milgaya h , answer store krliya , stack ko pop krdia

            //monotonic stack 
            while(!st.isEmpty() && list.get(i) > list.get(st.peek())){

                int prevDay= st.pop();
                ans[prevDay] =list.get(i);

            }
            // bakki curr elemetn ko store toh mujhe krna hi padega 
            st.push(i) ;


        }
        return ans ;

        
    }
}