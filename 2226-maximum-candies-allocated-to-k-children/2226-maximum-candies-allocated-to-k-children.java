// class Solution {
    
//     static boolean isvalidans(int [] candies, long k ,int maxcandies){
//         //check weather mid or maxpager is valid solution or not
//         int childrencount = 1;
//         int candie = 0;

//         for(int i = 0;i< candies.length;i++){
//             if(candie+candies[i] <=maxcandies){
//                 //iska matlb hai current candies can be assigne 
//                 // as it is outoflimit;
//                 // then assign

//                 candie= candie+candies[i];

//             }
//             else {
//                 //current child ko current candie 
//                 //cannot be assign ;

//                 childrencount++;
//                 if(childrencount>k || candies[i]>maxcandies){
//                     return false;

//                 }
//                 else {
//                     // can assign to newchild;
//                     candie = 0;
//                     candie = candie+candies[i];
//                 }
//             }
            
//         }
//         return true;
//     }
    
    
    
    
    
    
//      public int maximumCandies(int[] candies, long k) {
//         if(candies.length<k){
//             return 0;
//         }

//         int n = candies.length;
//         int s = 1;
//         int sum = 0 ;

//         for(int i = 0 ;i<n;i++){
//             sum +=candies[i];
//         }
//         int e = sum ;
//         int ans =n;

//         while (s<=e){
//             int mid = s + (e-s)/2;

//            if(isvalidans(candies,k,mid)){
//             ans =mid ;
//             e = mid-1;
//             }
//             else {
//                 // false vala case. ;
//                 s = mid+1;

//             }

//         }
//         return ans ;
//     }
// }
 
 
 class Solution {

    public boolean isValid(int[] candies, long k, int mid) {
        long children = 0;

        for (int pile : candies) {
            children += pile / mid;
        }

        return children >= k;
    }

    public int maximumCandies(int[] candies, long k) {

        int maxPile = 0;

        for (int pile : candies) {
            maxPile = Math.max(maxPile, pile);
        }

        int s = 1;
        int e = maxPile;
        int ans = 0;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(candies, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}
