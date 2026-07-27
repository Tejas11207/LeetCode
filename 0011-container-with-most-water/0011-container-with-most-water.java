class Solution {
    public int maxArea(int[] height) {
        // two solve this question use two pointer approach 
        int  n= height.length;
        int left = 0;
        int right = n-1;
        int max = 0;

        while(left <=right ){
           // checks the min height of the array and line  or of the arrray
            int h = Math.min(height[left],height[right]);

            // widht
            int width = right -left;
            // max area occu. by the  water store
            max = Math.max(max , width*h);

            // agage piche kr raha hu pss 
            if(height[left]< height[right]){
                left ++;

            }
            else{
                // left >right 
                right --;
            }

        }
        return max;
    }
}