class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s= 0;
        int e = n-1;
//         int max = 0;
    

//         int ans = -1  ;

//         for(int i =0; i<n ; i++){
//             if(nums[i]>max)
//             {
//                 max = nums[i];

//             }
//         }
        
//        while(s<=e){
//         int mid = s+(e-s)/2;
//         if(mid == max ){
//             return mid;

//         }
//         else if (mid<max ){
//             s= mid +1;

//         }
//         else {
//             ans = mid ;
//             e=mid-1;
//         }
        
//        }

//        return ans ;
//     }

// }


    while(s<e){
        int mid = s+(e-s)/2;

        if(nums[mid]>=nums[mid+1]){
            e= mid ;
        }
        else {
            s= mid+1;
        }
    }
     return s ;

    }
}
