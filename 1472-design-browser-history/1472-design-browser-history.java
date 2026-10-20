class BrowserHistory {

    Deque<String> currHistory;
    Deque<String> forwardHistory;


    public BrowserHistory(String homepage) {
        currHistory = new  ArrayDeque<>();
        forwardHistory= new ArrayDeque<>();
        //initally curr History me homepage bhi insert krna hai 
        currHistory.push(homepage);
    }
    
    public void visit(String url) {
        // visit kro and forward history clear kro 
        currHistory.push(url);
        while(!forwardHistory.isEmpty()){
            forwardHistory.pop();

        }
        
        
    }
    public String back(int steps) {
        //homePage se back nhi krunga , rest normally back krlo 
        while(steps > 0 ){
            if(currHistory.size() > 1){
                // main back kr skta hian
                String backTab = currHistory.pop();
                forwardHistory.push(backTab);

            }
            else{
                // back nhi kr skta hu 
                break ;


            }
            steps--;

        }
        return currHistory.peek();

        
    }
    
    public String forward(int steps) {
        // agar forward history me tab hain , toh farward krunga 

        while(steps > 0){
            if(forwardHistory.size() > 0){
                String forwardTab = forwardHistory.pop();
                currHistory.push(forwardTab);

            }
            else{
                // forward history me koi nhi hain  forward 

                break ;

            }
            steps--;

        }
        return currHistory.peek();

        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */