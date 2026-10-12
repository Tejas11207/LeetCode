// class Solution {
//     public int minSwaps(String s) {

//         // if length of string is odd then ans is impossible 
//         if(s.length() % 2 ==1){
//             return -1;

//         }

//         Deque<Character> st = new ArrayDeque<>();

//         // removing all the valid barckets paris 
//         // and keeping all the unmatched brackets inside the stack only 

//         for(char ch : s.toCharArray()){

//             // cancel out logic 

//             if(ch =='}' && !st.isEmpty() && st.peek() == '{'){

//                 st.pop();
//             }
//             else {
//                 //push krne ka logic -> { , } 
//                 st.push(ch);


//             }

            
//         }
//         //count open and close brackets 
//         int open = 0;
//         int close = 0;

//         while(!st.isEmpty()){
//             if(st.peek() == '{'){
//                 open++;


//             }
//             else{
//                 close ++;

//             }
//             st.pop();

        
//         }
//         // find the total number of reversal as pr the formula we discussed earlier 
//         // even 
//         if(open %2 ==0){
//             return (open/2) +(close /2);

//         }
//         else {
//             //odd case 

//             //return (close -1)/2 +2 + (open-1)/2;

//             return (open + 1) / 2 + (close + 1) / 2;
//         }
        
//     }
// }

class Solution {
    public int minSwaps(String s) {
        int count =0;
        int stackSize = 0;

        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i)=='['){

                stackSize++;

            }
            else if(stackSize ==0){
                count ++;

            }
            else {
                stackSize --;

            }
        }
        
        return (count +1)/2;
        

    }
}