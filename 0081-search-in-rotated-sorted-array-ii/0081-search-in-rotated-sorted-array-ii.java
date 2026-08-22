// class Solution {

//     // ye question me mujhe 3 baar bs apply krna hoga 
//     // phele toh pure array me 
//     // then array is rotated array so mujhe donp half spaces me check krna padega which ki mera target kaha hai 
//     // and also array me contains the duplicates so isliye mujhe  s++ and e-- kra pada if mere pss koi duplicate array hai yaa nhi ;

// //                  Find mid
// //                 ↓
// //         Is left half sorted?
// //           /             \
// //         YES              NO
// //          ↓                ↓
// //   Check target       Right half
// //   in left half       is sorted
// //          ↓                ↓
// //    Keep one half     Keep one half

//     public boolean search(int[] nums, int target) {

//         //Arrays.sort(nums);
//         int  n = nums.length;

//         int s = 0;
//         int e = n-1;


//         // is code se mere  255 case solve ho rahe hai but this question is about 
//         // rotated  sorted array toh mujhe right half and left half me dono me search krna hoga 
        
//         while(s<=e){

//            int  mid = s +(e-s)/2;

//             if(nums[mid] == target){

//                 return true ;

//             }

//             // duplicate checke kr rahe hai 
//             if(nums[s]==nums[mid] && nums[mid] ==nums[e]){
//                 s++;
//                 e--;

//             }
//             // ab no sorted halfs me check krnge 
//             // left part
//             else if(nums[s] <=nums[mid]){

//                     if(nums[s]<=target && target <nums[mid]){
//                 e = mid-1;

//                     }
//                     else {
//                         s = mid+1;
//                     }
                
//             }
//             else {
//                 // right half me sorted search 
                
//                 // 
//                 if(nums[mid] <=target && target< nums[e])
//                 {
//                   s = mid+1;
//                 }
//                 else {
//                e = mid-1;
//                 }
//             }

//         }
//         return false ;
//     }
// }

class Solution {

    public boolean search(int[] nums, int target) {

        int n = nums.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate case
            if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                s++;
                e--;
            }

            // Left half is sorted
            else if (nums[s] <= nums[mid]) {

                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
        }

        return false;
    }
}