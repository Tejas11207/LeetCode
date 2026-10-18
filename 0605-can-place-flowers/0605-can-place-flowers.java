class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // for(int i =0 ;i<flowerbed.length;i++){

        //     boolean left ;
        //     boolean right ;

        //     if(i==0 || flowerbed[i-1] ==0){

        //         left = true ;

        //     }
        //     else {
        //         left = false ;

        //     }
        //     if(i == flowerbed.length-1 || flowerbed[i+1] ==0){

        //         right =true ;

        //     }
        //     else {
        //         right  = false ;

        //     }
        //     if(left && right && flowerbed[i]==0){
        //        flowerbed[i] = 1;

        //         n--;
        //     }
        // }

        // return  n <=0;

        // secound approch 

        int count = 0;

        for(int i = 0; i < flowerbed.length;i++){

            if(flowerbed[i]==0){

            
            // mai 2 boolean arrays lunga 

                // left space me check kra 

                boolean emptyLeft = (i==0)
                ||(flowerbed[i-1]==0);

                
                // right space check kra 

                boolean emptyright =(i== flowerbed.length-1)|| flowerbed[i+1]==0;


                // both side empty hain toh bss flower ko place kro 
                // and count ko  plus kro
                if(emptyright && emptyLeft){

                    flowerbed[i] =1;
                    count++;

                }


            }
        }
        return count >=n;  // count ko dekho ki dono equal hain ki nhi ;
        
    }
}