class Solution {
  
    static void solve(String digits,int index,String[] mapping,List<String> result,StringBuilder output){

        // base case -> jaise hi index input string k bahar nikal jayrga,
        // iska matlb , output string ready h to push inside  result vali list ;

        if(index>=digits.length()){

            result.add(output.toString());
            return ;
        }

        //1 case me solve krnunga baki resurcion samabhal lega ;

        // jo meri value hai usko mujhe krna hai  integer me 
        // that why mujhe value me convert krna padega

        int value = digits.charAt(index)-'0';

        // then mene sari  abc....xyz ko value daal di unko dena hai ;
        
        String mappedString=mapping[value];

        // example -> value=5 , mappedString='jkl'
        // current value and uski mapped string paas ready h 
        // current block pr usse rakhdete h and baki recursion ko dedenge ;

        for(int i =0;i<mappedString.length();i++){

            output.append(mappedString.charAt(i));

            solve(digits,index+1,mapping,result,output);

            // backetracking;

            output.deleteCharAt(output.length()-1);
        }
    }
  
  
    public List<String> letterCombinations(String digits) {

        String [] mapping= {"","","abc","def" ,"ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> result = new ArrayList<>();

        int index = 0;
        StringBuilder output= new StringBuilder();
        
        solve(digits,index,mapping,result,output);

        return result;

        
    }
}