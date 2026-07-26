class Solution {
    public int maximumProduct(int[] nums) {
        
      //  Array.sort(nums);
        

        // are nos kunki max lowest value dede 
        int no1 =Integer.MIN_VALUE;
        int no2=Integer.MIN_VALUE;
        int no3 = Integer.MIN_VALUE;

        // smallest nos ke liye if two small no hoto if  i not use this the all three cases has been passed 
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;



        //for each chala diya sare elements ke liye 
        // voh sab single single ho isliye;

        for(int a : nums){
            // check kr rahe h no1 is greater then the  the array ka element 
            if(a>no1){
                // value assign kr rahe hai 
                no3 = no2 ;
                no2 = no1;
                no1=a ;
            }
            else if(a>no2){

                no3= no2;
                no2= a ;

            }
            else if(a>no3){
               no3=a ;
            }
           
           // for 2 smallest no ;

            if(a<min1){
                min2= min1;
                min1=a;
            }
            else if(a<min2){
                min2=a;

            }

             
        }
        // last me multiply kr rahe hai no1 se min nos ko kyu ki there is the  array which are at the asc order me hai ;
        return Math.max(no1*no2*no3,no1*min1*min2);
    }
}