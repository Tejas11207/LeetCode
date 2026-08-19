class Solution {
    
    static void solve(String s ,String output,ArrayList<String> ans){
        
        // aagar meri input string or remainging string empty aayi h ;
        // iska matlb outout string me permutation ready h 
        // uss ans vali list me store karlo and chalo wapas;
        //base case ;
        
        if(s.isEmpty()){
            ans.add(output);
            return;
            
        }
        // hr char ko current position pe try krke dekho 
        // and bakki recursion ko dedo
        
        for(int i =0; i <s.length();i++){
            
            char ch = s.charAt(i);
            
            String remString = s.substring(0,i)+ s.substring(i+1);
            
            // baki recrusion ko dedo
            
            solve(remString ,output+ch,ans);
        }
    }
    
    
    
    public ArrayList<String> permutation(String s) {
       
        ArrayList<String> ans = new ArrayList<>();
        // string  s jo given hai ;
        // empty string me toh mai apna ans input krvaunga 
        
        solve(s,"",ans);
        
        Collections.sort(ans);
        
        return ans;
        
    }
}