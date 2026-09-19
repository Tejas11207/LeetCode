/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    
    public Node rev(Node head){
        
        Node prev = null;
        
        Node curr = head;
        
        while(curr != null){
            
            Node forward =curr.next;
            
           curr.next = prev;
           
            prev=curr ;
            
            //curr.next = forward ;
            
            curr= forward ;
            
        }
        return prev ;
    
        
    }
    
    public Node addOne(Node head) {
        
        //step1.  - rev the linkedlist
            head = rev(head);
            
        //step2.  - add one 
        Node curr = head;
        int carry = 1;
        
        while(curr !=null){
            int nodeValue = curr.data;
            int sum = nodeValue +carry;
            int digit = sum%10;
            
            // insert the digit into curr node 
            curr.data = digit;
            
            // find out if there is any carry to pass on or not
            
            carry = sum/10;
            
            // move curr ko aage 
            if(curr.next ==null && carry >0){
                curr.next =  new Node(carry);
                carry=0;
                
            }
            curr = curr.next ;
            
        }
        //step3  - rev the ll  again 
        
        head = rev(head);
        
        // step 4  return head;
        
        return head;
    
    
    
    
    
    
    
    
    }
}