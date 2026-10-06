class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){

            // if this is a open bracket;

            // stack me daal diya hain 

            if(ch =='(' || ch =='[' || ch=='{') {
                st.push(ch);

            }
            else{
                // if ch is a cloasing bracket
                //we are going to check stack ka  top 
                // but best practise is to check first whether stack is empty of not 

                if(st.isEmpty()){
                    return false ;

                }
                if(ch ==')' && st.peek() !='('){

                
                //no match
                return false ;
                }
                else if(ch ==']' && st.peek() != '['){
                    //no match
                    return false ;

                }
                else if(ch =='}' && st.peek() != '{'){
                    //no match 
                    return false ;

                }
                   
                    else {
                        //match -> cancel out -> stack ko pop kro 
                        st.pop();

                    }
                


            }
        }
        
        // if stack is empty , then iska matlb valid expression tha , thats why bracket sb cancel out hogaye 

        if(st.isEmpty()){
            return true ;
        } 
        else {
            return false ;

        }
        
    }
}