class Solution {
    public int maxOperations(int[] nums, int k) {
        
        // sortt the array to use two - pointer techinque;

        Arrays.sort(nums);

        int count = 0; //isko sort krdiya isliye mujhe  bade element piche hie milenge 

        // sum me essay hogjayegga 


        int i = 0;
        int j = nums.length-1;


        while(i<j){

            int sum = nums[i] + nums[j];

            if(sum ==k){
                // found one valid pair;

                count ++ ;
                i++;
                j--;

            }
            else if(sum >k){
                // too big to, move the end pointer;

                j--;

            }
            else {

                // too small , move  the start pointer ;
                i++;

            }
        }
        return count ;

    }
}