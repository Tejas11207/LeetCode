// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int n = nums.length;
//         int s = 0;
//         int e = n-1;

//         while(s<=e){
//             int mid = s +(e-s)/2;

//             // check if one of the test case is single element ;
//             if(s==e){
//                 return nums[s] ;
//                 // nums[s] means  the real value  , that number not the index is  , s return krta toh only index return hota;

//             }
//             // non single element array;
//             // check weather mid element is a ans or not ;\\
    
//             int currentValue = nums[mid]; //mene current value ko store kra diya jo mid hai ;

//             int prevValue = -1;
//             if(mid-1 >=0) {
//                 prevValue  = nums[mid-1] ; // we just checking the  things ans storing them ;

//             }
//             int nextValue= -1;
//             if(mid+1 <n){
//                 nextValue = nums[mid+1]; // less then n means voh value meri array  ke anndar ho ;

//             }
//             // case one 

//             if(currentValue !=prevValue && currentValue != nextValue) {
//                 // toh meri current value hie mera ans hai ;
//                 return currentValue;

//             }
//             // case 2 if meri current value is not equal to the prevValue but equal to the next value;
//             // means current value  and next value ek pair bna rahe hai 
//             if(currentValue !=prevValue && currentValue == nextValue) {
//                 int startingIndexofpair = mid ; // toh jo mera starting index hai usko mid dediya ; 
//                 if((startingIndexofpair  &1)==1){
//                     // using bitwise operator se hum even or odd check krrahe hai 
//                     // startin index = odd vala case ;
//                     // ans left me hoaga 
//                     e = mid -1;

//                 }
//                 else {
//                     // starting index = even vala case ;
//                     // ans right me hoga ;
//                     // s = mid +1 ;
//                     s = mid +2;

//                 }
            

//                 // case 3  current value equal to prev value but not equal to next value 
//                 if(currentValue ==prevValue && currentValue != nextValue) {
//                     int endingIndexofPair= mid ;
//                     // ab mera current value and prev value pair bna rahe hai 
//                     if((endingIndexofPair & 1 ) == 1 ){
//                         // ending index is odd ;
//                         // ans right me hoga ;
//                         s = mid +1 ; 

//                     }
//                     else {
//                         // endingIndex pair is even ;
//                         // move to left ;
//                         //e = mid -1 ;
//                         e = mid-2;
//                     }



//                 }

//              }
        
            
//         }
//         return -1;
        
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            // Make mid even
            if ((mid & 1) == 1)
                mid--;

            if (nums[mid] == nums[mid + 1])
                s = mid + 2;
            else
                e = mid;
        }

        return nums[s];
    }
}