class Solution {
    public String removeKdigits(String num, int k) {
        

        Deque<Character> st = new ArrayDeque<>();


        // apply monotonic stack pattern on input string 

        for(char ch : num.toCharArray()){

            while(!st.isEmpty() && k>0 && st.peek() > ch){

                st.pop();
                k-- ; // k ko toh dekhna padega mujhe yrr 
            }

            // insert the current charcter 
            st.push(ch);

        }

        // step 2 : agar kuch removals still pending h , toh take care of it 
        while(k>0 && !st.isEmpty()){

            st.pop();
            k--;

        }

        //step 3 : build your ans string , revers it , remove leading elements if its is zero 

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){

            ans.append(st.peek()); // ans me store kraunga 
            st.pop(); // stack se remove kra ta junga 

        }

        // reverse string builder
        ans.reverse();

        // remove leading zeros ;
        int index = 0;

        while(index <ans.length() && ans.charAt(index) == '0'){

            index++;

        }
        String result = ans.substring(index);

        if(result.length() ==0){
            return "0";

        }
        else {

            return result;

        }


    }
}