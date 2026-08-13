class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // basically hum yaaha se pivot find krnege and 
        // jo bda hoga usko swap krna hai 
        // 
        int i = n-1;
        while(i>0 && nums[i-1] >=nums[i]){
            i--;

        }
        if(i==0){
            reverse(nums,0,n-1);
            return ;
        }

        int j = n-1;
        // yaha j  just bda hona chahiye i se tb hie hum solve kr panege 
        
        while(j>=i && nums[j]<=nums[i-1]){
            j--;

        }
        swap(nums,i-1,j);
        reverse(nums,i,n-1);

    
    }
    static void swap(int []nums, int i, int j ){

        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;

    }

    static void reverse(int nums[] , int start ,int end){
        while (start<end ){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]= temp;

        start ++;
        end --;
        }

    }

    
}