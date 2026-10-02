/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head ==null){
            return null;

        }

        //step 1 add the nodes 
        Node temp = head;

        while(temp !=null){
            Node cloneNode = new Node(temp.val);  // create the cloane node 
            cloneNode.next=temp.next; // add kra in b/w the old nodes   new 7 ko old 13 se joda  
            temp.next = cloneNode;     // old 7 ko new 7 se joda 
            temp=cloneNode.next; // temp ko old 13 pe legya 

        }

        //step 2 random nodes ko link kro 

        temp = head;

        while(temp !=null){
            Node oldNode = temp;
            Node newNode= temp.next;

            // newNode ka random = oldNode ka random ka next;
            if(oldNode.random !=null){
                newNode.random = oldNode.random.next;

            }

            // temp ko move 
            temp = newNode.next;

        
        }

        // step 3 detach the nodes 

        temp = head;

        // mujhe return krna hain new node ka head
        Node anshead= head.next;

        while(temp != null){
            Node OldNode = temp;
            Node CloneNode = temp.next;

            // actual detach node 
            OldNode.next =  CloneNode.next;

            if(CloneNode.next !=null){
                CloneNode.next =CloneNode.next.next;

            }

            // temp ko mode 
            temp = temp.next ;
            // kyun ki temp meri old node ke uppar tah 

        }
        return anshead;


    }
}