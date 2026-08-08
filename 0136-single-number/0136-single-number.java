class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        // xor ka use kro khali 
        // jo double no hai hosko zero krdeta hai xor oprator s hash map se jaydaacha
        for(int n :nums){
            ans ^=n;

        }
        return ans ;
        
    }
}