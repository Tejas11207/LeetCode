class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // this is two pointer approch 
        // jo ki fail hain 
        // int n = nums.size();
    
        // int x = Integer.MIN_VALUE;

        // int posSum = l-r;


        // int s = 0;
        // int e = n-1;

        //  int accSum = 0;
        // while(s<e){

        //   accSum = s-e;

        //     if(accSum > 0){

        //         x = Math.min(posSum,accSum);

        //     }
            
        // }
        // return accSum ;


        // now using two pointer approch 

        int n = nums.size();

        int best = Integer.MAX_VALUE;

        for(int len  = l ; len <=r ;len ++){
            int sum = 0;

            for(int i = 0 ;i< n ;i++){
                sum += nums.get(i);

                if(i >=len ) sum -= nums.get(i-len);
                if(i >= len - 1 && sum > 0 && sum <best ) best =sum;

            }
        }
        return best ==Integer.MAX_VALUE ? -1 : best ;

    }
}