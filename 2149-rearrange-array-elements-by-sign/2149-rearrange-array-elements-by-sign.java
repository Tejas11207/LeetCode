class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;

        //sam size as nums ;

        int [] ans = new int[n];

        //to pointers are assign s 
        // index dhyan rakhoo 
        // pos . no haar hamesha even index pe hai 
        // neg . no odd index is liye pos. no ko mene 0 index se chalu krvaya 
        // and neg no. ko 1 index se ;

        int pos= 0;  
        int neg = 1;

        for (int num : nums){

            if(num>0){
                // agar mera ans pos hai toh me usko store krdunga
                //ans me
                ans[pos] = num; 
                // and uski index +2 se badha dunga 
                // like 0 , 2,4,6 .....2n;
                pos +=2;
            }else {
                // if mera element negative hai toh mere usko store krdunga 
                
                ans[neg]=num;
                //and uski position odd index se chalu hai toh 
                // 1 ,3,5,7,.....2n+1;
                neg +=2;

            }
        }

            return ans;


    }
}