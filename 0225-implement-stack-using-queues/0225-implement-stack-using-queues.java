class MyStack {

    Queue<Integer> q1;  
    Queue<Integer> q2;

    // 2 list bnai hain 
    // q1 and q2 so q1 is main queue where we can demonstrate the methods like poLL() , isEmpty() and peek() etc 
    // q2 is helper queue where we just use it to reverse the element  
    // bcuz until we not reverse we cant implemnet the things of stack and all 
    // so there is 3 step 1 
    // first insert the element in q2 -> helper
    // step 2 
    // insert the element of q1 into the q2 
    // then 
    // step 3 
    // swap the queues 
    // q2 element into q1 
    // reverse hojayenge 

    public MyStack() {

        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

        
    }
    
    public void push(int x) {

        // step 1 insert into q2 

        q2.offer(x);

        // step 2   q1 ke elements ko q2 me daalo 

        while(!q1.isEmpty()){

            q2.offer(q1.poll());

        }
        // step3 = swap into q1 and q2 

       Queue<Integer> temp = q1;

       q1 = q2;

       q2 = temp ;

        
    }
    
    public int pop() {

        return q1.poll();

        
    }
    
    public int top() {

        return q1.peek();

        
    }
    
    public boolean empty() {

        return q1.isEmpty();

        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */