class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        // 2 methods to solve this question 
        //1 is hash map 
        // 2 is sotre the all the 26 lowercase alphabat in the the array and travel to the whole series and the y give u ans ;
        
        // method 2 se kr rhaah hu 
        
        int []freq = new int[26];
        // travese over string and update thir frequencey accoridingly
        
        for(int i = 0;i<s.length();i++){
            char currchar = s.charAt(i);
            freq[currchar-'a']++; // means hume sare alphaberte me chahiye
        }
        
        int maxfreq = -1;
        char ans = 'a' ;
        
        // traverse over the freq array and gtet the highest freq vala elment 
        
        for(int i =0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ans = (char)(i+'a'); // type cast kr diya hai 
            }
        }
        
        return ans; 
        
    }
}