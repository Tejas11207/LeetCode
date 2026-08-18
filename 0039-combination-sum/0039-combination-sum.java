class Solution {
   
   public void solve(int [] candidates, int target , int index , List<List<Integer>> ans , List<Integer> output){
        // base cases 

        if(target ==0){
            // target 0 ka mtlb , mera output vali list me ek answer ban chuka h;

            // then store this ans into ans wali list h means output vali list me ;

            ans.add(new ArrayList(output));
            return ;

        }

        if(index >= candidates.length){
            return ;

        }
        if(target <0){
            return ;

        }
        // 1 case hum solve krenge baki recursion samabhal lega ;

        // ek include ka case and ek exlcude ka case ;

        // include ;
        // mene output ke aander candidates[index] add kr diya then last me voh hie mera output ans me jayega ;

        output.add(candidates[index]);

        solve(candidates , target-candidates[index],index , ans, output);

        //backtracking

        output.remove(output.size()-1); //unique ans chahiye;

        //exclude 
        solve(candidates,target , index+1 ,ans , output);


   }
   
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> output= new ArrayList<>();

        int index = 0;

        solve(candidates, target,index ,ans , output);

        return ans ;

        
    }
}