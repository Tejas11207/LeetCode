class Solution {
   
   static void getAllSubsequence(String s,int index,StringBuilder output,List<String> ans)
    {
        //base case ;
        
        if(index >=s.length()){
            //subsequencr ready h ;
            String subsequence  = output.toString();
            ans.add(subsequence);
            return;
            
        }
        // 1 case hm solve krnege , bakki recursion sambhal lega
        char  ch = s.charAt(index);
        //include;
        output.append(ch);
        getAllSubsequence(s,index+1,output,ans);
        
        // exclude 
        output.deleteCharAt(output.length()-1);
        getAllSubsequence(s,index+1,output,ans );
    }
   
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        
        StringBuilder output = new StringBuilder();
        
        int index = 0;
        
        getAllSubsequence(s,index,output,ans);
        Collections.sort(ans);
        return ans ;
    }
    
    
}