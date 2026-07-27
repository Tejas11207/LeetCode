// class Solution {
//     public int maxProduct(int[] nums) {
        

//         // so the best approch is that ek max 1 and dusra max 2 max2 bada no then max 1 ;
//         int max1 = Integer.MIN_VALUE;
//         int max2 = Integer.MIN_VALUE;

//         // ek pointer max1 pe and antother max 2 
//        // max2 > max1;

//        for(int i :nums){
//         if(i>max1){
//             max2=max1;
//             max1=i;

//         }else if(i> max2){
//             max2=i;
//         }
//        }
//         return (max1-1)*(max2-1);
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}