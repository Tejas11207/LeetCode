class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        Integer[][] dp = new Integer[mat.length][5001];
        return minDiff(mat, 0, target,0, dp);
    }
    
    public int minDiff(int[][] mat,int index,int target, int val, Integer[][] dp){
        if(index == mat.length){
            return Math.abs(val - target);
        }
        if(dp[index][val] != null){
            return dp[index][val];
        }
        
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < mat[0].length; i++){
            res = Math.min(res, minDiff(mat, index + 1, target, val + mat[index][i], dp));
        }
        
        return dp[index][val] = res;
    }
}


// class Solution {
    
//     static int solve(int sum,int target,int[][] mat,int row )
//     {
//         if(row >=mat.length){
//             //invalid row index;
//             // sum is ready
//             // calculate the diff b/w target and sum 
//             // store or return min diff;

//             return Math.abs(target-sum);
//             // yeh mujhe accurate ans laki dega 

//         }
//         int mini = Integer.MAX_VALUE;
//         // main row index pr khada hu ,isme multiple columns ;
//         // pr jake value padi hai ,  and hr ek column ko one by one consideer krunga and baaar baar ans ka minimum leta rahunga 
//         // only need for the rows
//         for(int num:mat[row]){
//             int ans=solve(sum+num, target,mat ,row+1);
            
//             // min vala ans 

//             mini = Math.min(mini,ans);
//         }
//         return mini;
        
//     }

    
    
//     public int minimizeTheDifference(int[][] mat, int target) {
//         // muhjhe only row chahiye thi toh mene row  ka varible liya 

//         int row = 0 ;
//         int sum = 0 ;
         
//          int ans = solve(sum,target, mat ,row);
//          return ans ;

//     }
// }