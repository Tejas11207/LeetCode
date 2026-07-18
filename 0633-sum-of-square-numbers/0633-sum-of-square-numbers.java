class Solution {
    public boolean judgeSquareSum(int c) {
        
        long s = 0;
        long end = (long) Math.sqrt(c) ;

        while(s<=end){

            // first condition ;
            long sum = s*s + end*end ;

            if(sum == c){
                return true ;

            }
            else if(sum<=c){
                s++;

            }
            else{
                end --;
            }
        }
            return false ;

    }
}