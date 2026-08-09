// and yeh dp vala ans hai 
class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}




// is solution me time limit exceeded hai kyuki , iss same sawal ko mai bohot fast solve kr sakta hu with the help of the dp but liner tc and yeh vala solution le raha hai exponetial tc 
//class Solution {
   
//    static int solve(int[]nums , int index){
   
//     if(index>=nums.length){
//         return 0; // jb mere pss koi ghar hie nhi honge toh me kya hie return krna 0 obs

//     }
//     // 1 case hum solve krenge baki recursion sambhal lega
//     //main index vale house pe hu 
//     // mere paas 2 choice hai , include or exclude 
//     int includecase=nums[index]+ solve(nums,index+2); // no chori in adjacent household
//     int excludecase = 0+solve(nums,index+1); // pehla toh me choud raha hu so then me pure array pe travel kr raha hu naa

//     int finalans = Math.max(includecase,excludecase);
//     return finalans;

//    }
   
   
   
   
//     public int rob(int[] nums) {
//         int index = 0 ;

//        int ans  =solve(nums,index);
//        return ans ;

//     }
// //}