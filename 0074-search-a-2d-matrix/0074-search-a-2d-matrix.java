class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow= matrix.length;
        int totalcolumn = matrix[0].length;

        int n = totalrow * totalcolumn ;
        int s = 0;
        int e = n-1;

        // bs
         while(s<=e){
            int mid = s +(e-s)/2;
            int rowIndex = mid/totalcolumn;
            int columnIndex= mid%totalcolumn;

            if(matrix[rowIndex][columnIndex]==target){
                return true;

            }
            else if(matrix[rowIndex][columnIndex]>=target){
                e = mid-1;
            }
            else{
                s= mid+1;

            }
         }
            return false ;
    }
}