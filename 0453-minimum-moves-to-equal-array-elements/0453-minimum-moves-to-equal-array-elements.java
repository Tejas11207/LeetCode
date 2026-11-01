class Solution {
    public int minMoves(int[] nums) {
        // mujhe iss question me 
        // 2  tarike se solve kr skta hun 
        //1 saare elemnet ko equal krdo 
        // with the help of + - se 

        // yaha mene - ka use kiya hain 


        // min num. milgya mujhe 
        // me sb ko uss min no se min kr dunga  
        // then. ek time pe mere sare element 0 hojayege 
        // and  mujhe  pta hain 0 hone ke baad elements 
        // equal hie rahenge 
        //so its is the proceesss

        
        int min = Integer.MAX_VALUE; // min num leleiya 

        int count = 0; // kinte passes me pura horaha hain mera sb kuch 

        for(int num : nums){
            min = Math.min(min ,num);

        }// iss loop se mujhe min no miljayega 

        for(int num:nums){

            count += num-min;

        }// and isse me count ko inc bhi kr raha hun and sare num - bhi horahin hain 

        return count ; // return the count 


    }
}