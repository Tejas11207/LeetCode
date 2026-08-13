// dp vala solution abhi tk nhi padhiya  hai 
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;        
    }
}




// class Solution {
   
//    static Boolean solve ( int [] nums, int index ){
//         // base case 
//         // reached destination;

//     if(index == nums.length-1){
//         return true ;
//     }
//     // destination se bhar / aage nikal gya 
//     if(index>=nums.length){
//         return false;
//     }
//     // stuck hone vali situation
//     if(nums[index]==0){
//         return false ;
//     }
//     // ab maine 1 case solve krunga , baki recursion  sambhal lega;

//     int jumpvalue = nums[index];

//     // jump => max jump possible from current position

//     boolean overAllAns = false ;

//     for(int jump = 1 ;jump<=jumpvalue;jump++){
//         Boolean recAns = solve(nums,index+jump);
//         overAllAns = overAllAns || recAns;

//     }
//     return overAllAns;

//    }
   
   
   
//     public boolean canJump(int[] nums) {

//         int index = 0;
//         Boolean ans = solve(nums,index);

//         return ans ;
        
        
//     }
// }