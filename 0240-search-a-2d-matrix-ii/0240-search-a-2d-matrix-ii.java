/// isme hum bs nhi use kr satke hai  kyu ki the prev element is bigger then the next row vala element and then brute froce me O(mXn ) tc aarha tha but this solution is more optimal then the brute force and m+n tc hai 


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length;
        int totalcolumn = matrix[0].length;

        // mujhe chalue right most index se krna tha toh isliye ek duk corner vale ko pakad liya hai and humari condtion ko bhi satisfiya krna chaiye
        int row = 0;
        int col = totalcolumn - 1;

        while (row < totalrow && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                // col ko piche kro and then agge  apna element dhundo 
                col--;
            } else {
                // matrix[row][col] < target
                row++;
            }
        }
        return false;
    }
}