class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = i+1;

        while(j<n){
            if(nums[j]==nums[i]){
                j++;
            }
            else {
                i++;
                nums[i]= nums[j];
                j++;
            }
        }
        return i+1;
    }
}