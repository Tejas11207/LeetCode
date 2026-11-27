class MyQueue {

    Deque<Integer> st1;
    Deque<Integer> st2;

    public MyQueue() {
        st1 = new ArrayDeque<>();
        st2 = new ArrayDeque<>();

        
    }
    
    public void push(int x) {

        while(!st1.isEmpty()){
            int element = st1.peek();

            st1.pop();

            st2.push(element);



        }
        st1.push(x);


        while(!st2.isEmpty()){
            int stack2Element = st2.peek();

            st2.pop();

            st1.push(stack2Element);

        }
        
    }
    
    public int pop() {

       return  st1.pop();
        
        
    }
    
    public int peek() {

        return st1.peek();

        
    }
    
    public boolean empty() {

        return st1.isEmpty();
        
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//  Deque<Integer> st1;
//     Deque<Integer> st2;

//     public MyQueue() {

//         st1 = new ArrayDeque<>();
//         st2 = new ArrayDeque<>();

        
//     }
    
//     public void push(int x) {
//         // step1  shift elements of stack1 into stack2 

//         while(!st1.isEmpty()){

//             int topElement = st1.peek();

//             st1.pop();

//             st2.push(topElement);

//         }

//         // step 2 insert elemenets in stack1 

//         st1.push(x);

//         // step3 shift elements of stack 2 in stack 1 

//         while(!st2.isEmpty()){
//             int topElement = st2.peek();
//             st2.pop();

            
//             st1.push(topElement);

//         }
        
//     }
    
//     public int pop() {
        
//        return  st1.pop();

//     }
    
//     public int peek() {
//         return st1.peek();

        
//     }
    
//     public boolean empty() {
//         return st1.isEmpty();

//     }
