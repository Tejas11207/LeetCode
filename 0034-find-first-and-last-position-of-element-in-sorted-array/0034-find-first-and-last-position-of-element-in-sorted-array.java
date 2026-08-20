class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int s= 0;
        int e = n-1;

        //mujhe target ki fist and last index value chahiye 
        // so isliye mene fist index ke liye create kiya hai varible
        int firstIndex =-1;

        while(s<=e){

            int mid = s +(e-s)/2;

            // fir voh me bs 
            if(nums[mid]==target){
                // mid mera target ke equal hai toh mid ke so mere first value voh hie vo gie

                firstIndex = mid;
                // then mene e ko shift kr diya kyuki most of the chance me mid ke aas paas hie meri value hogi

                e = mid-1;
                
            }
            else if(nums[mid] <target){
                s =mid+1;

            }
            else {
                e = mid -1;

            }
        }
        

        s = 0;
        e = n-1;

        // same chize mene last index ke liye ki

        int lastIndex= -1;

        if(firstIndex==-1){

            return new int[]{-1,-1};

        }
        while(s <=e){

            int mid = s +(e-s)/2;

            if(nums[mid]==target){
                lastIndex = mid ;

                //bss mene abhi start index ko mid +1 kr diya
                s =mid+1;

            }
            else if(nums[mid]<target){
                s= mid+1;

            }
            else {
                e= mid-1;
            }
        }
        return new int [] {firstIndex,lastIndex};
    }
}