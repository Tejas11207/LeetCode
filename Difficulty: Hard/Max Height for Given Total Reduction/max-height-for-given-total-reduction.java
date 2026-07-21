class Solution {

    static Boolean isvalidans(int[] arr, int m,int maxHeight){
        
        long totalwoodcollected =0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>maxHeight){
            //iska matlb   ,sawblade overall tree height se chotta h 
            // therefore ,pkka kuch amount of wood dega katne pr 
            
            long currentwoodcollected= arr[i]- maxHeight; // mujhe   jaha mera arrya hoga vha pe kuch na kuch height hogi bss. muko - krna na hai sawblade ki heigt se 
            totalwoodcollected = totalwoodcollected+currentwoodcollected;
            }
            if(totalwoodcollected >=m) {
            return true ;
        }
        }
       
         return false;
    }
    





        //indicate the sawblade s height
	int maxHeight(int[] arr, int m) {
		
		int n = arr.length;
		int s = 0;
		int maxi = 0; // mera maxinum is hie mera end banyega
		
		for (int i = 0; i<n; i++) {
			if (arr[i]>maxi) {
				maxi = arr[i];
				
			}
		}
		int ans = -1;
	    int	e = maxi;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (isvalidans(arr, m, mid)) {
				// ans store i have the potenial ans 
				ans = mid;
				// check the right sided part if there is ans over there 
				s=mid+1;
			}
			else {
			    
				e = mid-1;
			}
			
		}
		
		return ans ;
	}
}
