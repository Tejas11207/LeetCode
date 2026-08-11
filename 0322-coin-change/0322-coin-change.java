// dp approch

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
    }
}



// tle error
// class Solution {
    
//     static int solve(int[] coins,int amount)
//     {
//         //base case 

//         if(amount ==0){
//             return 0;

//         }
//         if(amount< 0) {
//             // not a valid amount 
//             return Integer.MAX_VALUE;

//         }
//         int mini = Integer.MAX_VALUE;

//         // mere paas ek amount hai and maine iss amount k liye saare coins ko try krunga ,i willl ake sure that i am trying each and every possible combinations to find the min coins count;

//         for(int coin:coins){

//             int recursiveKaAns = solve(coins, amount-coin);
//             if( recursiveKaAns!=Integer.MAX_VALUE){
//                 // valid case -> recursiveKaAns != max_value;
//                 // +1 isliye kiya kyuki  humko starting vala case bhi include krna tha 
//                 // jab humne sare case use kre the
//                 int totalcoinsused =recursiveKaAns+1;

//                 // min value of the coins chahiye thi
//                 mini = Math.min(mini,totalcoinsused);
//             }
//         }
//         return mini;
    
//     }
    
    
    
    
    
    
    
//     public int coinChange(int[] coins, int amount) {

//         int ans = solve(coins , amount);
//         if(ans ==Integer.MAX_VALUE){
//             return -1;
//         }
//         else {
//             return ans ;

//         }
        
//     }
// }