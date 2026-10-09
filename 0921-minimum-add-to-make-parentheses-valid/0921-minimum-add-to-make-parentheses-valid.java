class Solution {
    public int minAddToMakeValid(String s) {
        // string vala method 
        // int opened = 0, added = 0;
        // for (char ch : s.toCharArray()) {
        //     if (ch == '(') opened++;
        //     else if (opened > 0) opened--;  // close a pending "("
        //     else added++;  // ")" with nothing to close -> add a "("
        // }
        // return added + opened;  // still-open "(" need a ")" each

        // stack vala method 

        Deque<Character> st = new ArrayDeque<>();
        int addition = 0;

        for(char ch : s.toCharArray()){

            if(ch =='('){
                st.push(ch);

            }
            else{
                // ch ==')'
                // toh mujhe iss closing barcket ko outkrena hoga 
                if(st.isEmpty()){
                    addition++;

                }
                else{

                    //opening  bracket  present  h stack me 
                    st.pop();

                }
            }
        }

        //final answer kis kis se banega -> addition , st.size()
        //addition -> no of opening brackets needed extra
        //no of closing brackets needed ;
        
       
        int finalAns= addition+st.size();
        return finalAns;

        
    }
}