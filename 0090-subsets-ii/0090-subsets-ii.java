class Solution {

   static void solve(int[]nums,int index , List<Integer> output , List<List<Integer>> ans){


         // base case 
     if(index>= nums.length){
            // subsequence ready hai -> output wali list me iss subsequence ko store krna hai , ans me 

            ans .add (new ArrayList<>(output));
            return ;

        }
        // include - exclude pattern

        int currvalue = nums[index];

        // include 
        output.add(currvalue);
        solve(nums,index+1,output,ans);

        //backtracking step ;


        output.remove(output.size()-1);

        // exclude
        // ab merko repetion allow hai toh uska matlb hai ke mere ek subset me duplicate value allow hai but entere powerset me koi duplicate value not allow 
        // iske liye me ye kr satka hu 

        // assume currvalue = 3 ;
        // 3 3 3 3 4 
        // while exclueding, ingnore the same element and move on to the  new element 
        // ye exclude vala logic edx assumpation pe based hai 

        while(index +1 <nums.length && nums[index] ==nums[index+1]){
            //jb tk mera element same hai tb tk mujhe ko ignore marna hai 
            index++;

        }

        solve(nums,index+1,output,ans);
    }
    public List<List<Integer>>subsetsWithDup(int[] nums) {

        // kyuki question me sorted manner me hie given hai 
        Arrays.sort(nums);

        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> output = new ArrayList<>();

        int index = 0;

        solve(nums,index,output, ans);

        return ans ;
        
    }
}