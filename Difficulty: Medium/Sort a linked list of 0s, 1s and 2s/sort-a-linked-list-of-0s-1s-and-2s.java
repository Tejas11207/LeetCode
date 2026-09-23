/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        
       // dummy nodes create kro  of 0 ,1 and 2 
        //0;
        
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        
        //1;
    
        
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        
        
        //2;
        
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        
       // fir  travel kro on a LL see 0 , 1 and 2 ko aapni appni respected nodes pe attach kro
       
        Node temp = head;
        
        while(temp != null){
            
            if(temp.data ==0){
                
                Node nodeInsertInto = temp;
                temp =temp.next;
                
                zeroTail.next = nodeInsertInto;
                
                zeroTail = nodeInsertInto;
                
                
            }
            else if(temp.data == 1){
                Node nodeInsertInto = temp;
                temp =temp.next;
                
                oneTail.next = nodeInsertInto;
                
                oneTail = nodeInsertInto;
                
                
            }
            else  if(temp.data == 2){
                Node nodeInsertInto = temp;
                temp =temp.next;
                
                twoTail.next = nodeInsertInto;
                
                twoTail = nodeInsertInto;
                
                
            }
        }
       // fir uunko aadujst kro 
       // humre 3 subList ready hain bss usnko jain krna hai 
       zeroTail.next = (oneHead.next !=null) ?  oneHead.next : twoHead.next;
       
       oneTail.next = twoHead.next ;
       
       twoTail.next = null;
     
       
       // head ki postion change kro 
       // mujhe kahli zero dummy node ki head ki postion change krna hai kyuki baki toh mene kr hie diya 
       
       zeroHead  = zeroHead.next;
       
       
       
       // return kro 
       
       return zeroHead;
       
    }
}