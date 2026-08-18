class Solution {


    public void solve(int [] candidates, int target , int index , List<List<Integer>> ans , List<Integer> output ,int count,int k ){
        // base cases 

        if (count>k){
            return ;
        }
        if(count ==k  && target ==0){
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

        // question me repetation not allow so index no , index+1 se kaaam chalega 
        // kyuki mene output me phele se hie add kr rakha hai indexes ho
        output.add(candidates[index]);

        solve(candidates , target-candidates[index],index+1, ans, output,count+1,k);

        //backtracking

        output.remove(output.size()-1); //unique ans chahiye;
        // and slo mene output ke aander candi.index ko include kiya tha so we have to remove it na and the kyuki ans toh mujhe aass it is bhejna hia


        // ab question me bola hai hai ki unique combo hie chalge , so jess value ko mene exclude kiya hai voh value wapas nhi leni hai 
        while(index+1 <candidates.length && candidates[index] == candidates[index+1]){

            index ++;
        }

        //exclude 
        solve(candidates,target , index+1 ,ans , output,count,k);


   }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //Arrays.sort(candidates); // hum yaha sort krenge tb hina hume pta chalega ki uniqe element  ko  lana hai 
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> output= new ArrayList<>();
    
        int index = 0;
        int target =n;
        int candidates []= {1,2,3,4,5,6,7,8,9};
        int count = 0;;


        solve(candidates, target,index ,ans , output,count,k);

        return ans ;

        
    }
}