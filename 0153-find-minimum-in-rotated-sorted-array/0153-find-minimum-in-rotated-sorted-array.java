class Solution {
    public int findMin(int[] nums) {

       // int n = nums.length;

        int s = 0;
        int e = nums.length-1;

        // solve krne ke 2 method

        // 1 find the minmum no...
        // then apply bs on that ;
        // too much tle errror may occure ;

        //2 was this which i did

        while(s<=e){

            int mid = s+(e-s)/2;

            // mera array rotated array so  // mere sorted array ko rotate krdiya toh mera minum no toh piche hie aaayega ;
            // no mene  aagare meraa end vala part bada hai mera nums[mid] se toh mere pss ek posible and toh hai toh me store kr dunga e = mid se 

            if(nums[mid]< nums[e]){
               e = mid;

            }
            else {
                // if nhi to start ko shift krdunga 

                s = mid+1;
            }
        }
        // last me end vale no ko return kr dunga 
        return nums[e];
    }
}