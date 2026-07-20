class Solution {
    
     static Boolean isvalideans(int[] arr, int k , int  mindistance)
          // brute force ;
          
     {
         int countcow = 1;
         
         // first cow is placed at zero index 
         int lastpositionofthecow = 0;
         
         for(int i =1 ; i<arr.length;i++){
             
             if(arr[i]-arr[ lastpositionofthecow]>=mindistance){
             countcow ++;
             lastpositionofthecow=i;
             
             }
             
            if(countcow ==k){
                
                return true ;
            }
             
             
             
             
         }
         return false;
     }
    
    
    
    
    public int aggressiveCows(int[] arr, int k) {
        // code here
        
        Arrays.sort(arr);
        int n =arr.length;
        int s =  0;
        int e = arr[n-1] - arr[0];
        int ans = -1;
        
        
        while(s<=e){
            int mid = s +(e-s)/2;
            
            if(isvalideans(arr, k, mid)){
                //ans store kro means i have my potential ans and sotre them 
                // then move to right;
                // i need to find less distance no;
                
                ans = mid ;
                s = mid +1;
                
            }
            
            else {
                // mujhe right me ans nhi mila toh me left me check krunga ki mere pss mera numb. hai 
                // chota vala no lena hai miujhe ;
                e = mid -1;
            }
            
            
        }
        return ans ;
    }
}