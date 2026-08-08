class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        // basiclly humne count and ans leliya ans  freq of the 1 store rakhenge and count se 1 ki freq dekhnege 
        int count =0;
        int ans = 0;

        int n = nums.length;
        // loop ki madad se itreate kiya 
        for(int i = 0;i<n;i++){
            // i mera 1 aaraha hai toh count ki value ko upate kr do
            if(nums[i]==1){
                count++;

            }
            //nhi toh jiss point pe i ki value 1 nhi aaye us point pe count ko zero kr do 
            else {
                count =0;
            }
            //last me jo bada hai ans or count me se usko print krdo 
            ans = Math.max(ans ,count);

        }
        return ans ;
       
    }
}