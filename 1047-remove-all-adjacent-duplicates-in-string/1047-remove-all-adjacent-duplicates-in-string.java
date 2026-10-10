class Solution {
    public String removeDuplicates(String s) {

        // StringBuilder ans = new StringBuilder();

        // // sab pe itrate kra 
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     // compare ans k rightmost character ko current character se 
        //     if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
        //         ans.deleteCharAt(ans.length() - 1);

        //     } else {
        //         // if these 2 are different characters
        //         ans.append(ch);
        //     }
        // }
        // return ans.toString();

        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){

            if(!st.isEmpty()){

                    if(st.peek()==ch){
                        //remove duplicates
                        st.pop();

                    }
                    else{
                        // not equal
                        st.push(ch);

                    }

            }

            else  
                {

                    // stis is empty
                    st.push(ch);

                }

            
        }

        // stack aagar empty h toh return empty string as answer or 
        // non empty h toh create a string using stack element 
        // and reverse and return it as an answer;

        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()){
            str.append(st.peek());

            st.pop(); // khali kro string ko 

        
            
        }

        return str.reverse().toString(); // last me reverse kro




    }

}