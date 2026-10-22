class Solution {
    public int search(int[] nums, int target) {
    //     int n = nums.length;
    //     int start=0;
    //     int end =n-1;
    //     int mid = start+(end-start)/2;
        
    //     while(start <=end){
    //         if(nums[mid]==target){
    //             return mid;

    //         }
    //         else if(target>nums[mid]){
    //             start = mid+1;

    //         }
    //         else {
    //             end = mid -1;
    //         }
    //         mid = start +(end-start)/2;
    //     }


    //    return -1 ; 

     int n=nums.length;

     int s = 0;
     int e = n-1;


     while(s <= e){

        int mid = s + (e-s)/2;

        if(nums[mid] == target){

            return mid;

        }
        else if (nums[mid] > target)
        {
            e  = mid-1;

        }
        else {
            s = mid+1;

        }
     }
      return -1;
      
    }
}