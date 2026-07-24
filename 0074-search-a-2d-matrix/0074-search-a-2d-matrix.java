
// ye code is valid untile this conditions is there The first integer of each row is greater than the last integer of the previous row.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length; // isme humne total row as store karvaye
        int totalcolumn = matrix[0].length; // total column store 

        // 1 D bs 
        int n = totalrow * totalcolumn; // 1 d me convert kr diya  length nikali 
        int s = 0;
        int e = n - 1;

        // bs
        while (s <= e) {
            int mid = s + (e - s) / 2;

            int rowIndex = mid / totalcolumn; // formula of find or for traval the index in 2 d matrix and  in terms of row
            int columnIndex = mid % totalcolumn; // formula of find or for traval the index in 2 d matrix and  in terms of column

            if (matrix[rowIndex][columnIndex] == target) {
                return true;

            } else if (matrix[rowIndex][columnIndex] >= target) {
                e = mid - 1;
            } else {
                s = mid + 1;

            }
        }
        return false;
    }
}