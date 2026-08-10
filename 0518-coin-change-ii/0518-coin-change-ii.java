class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for (int c : coins) {
            for (int a = c; a <= amount; a++) {
                dp[a] += dp[a - c];
            }
        }
        
        return dp[amount];        
    }
}





// time limit exceeds dp ki hisab se me jalid krdeta tha
// class Solution {
   
//    static int solve(int amount, int[] coins,int index){
//     // base case
//     if(amount == 0){
//         return 1;
//     }
//     if(amount<0){
//         return 0;
//     }
//     if(index>=coins.length){
//         return 0;
//     }

//     // ek case hum solve krenge baki recursion apne. aapa kr lega 
//     // maine coins ki value 5 hai , and amount ki value 40 hai toh 
//     // remanining amount 40-5 is 35 hojayega 

//     int includeCase = solve(amount-coins[index],coins,index);

//     //main lo amount 40 hai ,or maine current coin ko use nahi kia 
//     // iska matlb amount me koi change nhi hua hai
//     // but kyuki main current coin ko exclude kra hu , toh mujhe next coins pr move krena padega 
//     int excludeCase = solve(amount,coins,index+1);
//     int finalAns = includeCase+excludeCase;
//     return finalAns;
    
   
//    }
    

//     public int change(int amount, int[] coins) {
//         int index = 0;
//        int ans = solve(amount, coins,index);

//        return ans;
        
//     }
// }