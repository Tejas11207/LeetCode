class RecentCounter {

    // ye question sabse esay hain for the sliding window method 
    // nikalna hain and move krna hain mujhe 
    // means ek window ko move krna hain 
    // fixed size ki 
    // menas piche valo ko niklana hain and agge valo ek add krna hain step by step 

    Deque<Integer> q ;

    public RecentCounter() {

       q = new ArrayDeque();

        
    }
    
    public int ping(int t) {

        // step 1 -> insert kro queue ke annder elements ko 
        // record the req in q ;


        q.offer(t);

        
        // while loop 
        //step2 ; remove invalid req and return the total valid req. in the range 
        //removal ;


        while(!q.isEmpty() && q.peek() < t-3000){

            //invalid req found 

            q.poll();

        }

        // ad q me sirf valid req bachi h , toh 
        // total no . of req in there  range = total req in q; 
        
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */