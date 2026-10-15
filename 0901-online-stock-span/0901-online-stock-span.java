class StockSpanner {

     private Deque<int[]> st ;
        //int [0]  -> for price 
        //int [1] -> span 

    public StockSpanner() {
        st = new ArrayDeque<>();


        
    }
    
    public int next(int price) {
        int span= 1;

        //monotonic pattern
        while(!st.isEmpty() && st.peek()[0] <=price ){

            span = span + st.peek()[1];
            st.pop();

        }
        //insert the current element int to the stack 

        st.push(new int[]{price,span});
        return span;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */