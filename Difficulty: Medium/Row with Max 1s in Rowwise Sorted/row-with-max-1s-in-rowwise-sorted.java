class Solution {
	static int getFirstOccIndex(int[][]arr, int rowIndex) {
		int totalrow = arr.length;
		int totalCol = arr[0].length;
		int target = 1;
		int ans = -1;
		
		// handling case wherethere is no 1 inside the row
		if (arr[rowIndex][totalCol - 1] == 0) {
			// it means there is no 1 inside this row
			return totalCol;
		}
		else {
			// 1 exist inside the row ;
			int s = 0 ;
			int e = totalCol - 1;
			
			while (s <= e) {
				int mid = s + (e - s)/2;
				if (arr[rowIndex][mid] == 0) {
					// move to right;
					s = mid + 1;
					
				}
				else {
					// ==1 vala case;\
					ans = mid ;
					
					// move to left ;
					
					e = mid - 1;
					
				}
			}
			
		}
		return ans ;
		
	}
	
	public int rowWithMax1s(int[][] arr) {
		
		int totalRow = arr.length;
		int totalCol = arr[0].length;
		int max = -1;
		int maxOneWaliRowIndex = -1;
		
		// move to each row and for each row
		// find the first occurent;
		// using the F.O will calculate the count of 1's
		// update the maxi variable or the ans index variable basis on that ;
		
		for (int row = 0; row <totalRow; row++) {
			// for each row , finfd the f.O
			int firstOccIndex = getFirstOccIndex(arr, row);
			// calclulate number of 1's in this row
			int oneCount = totalCol - firstOccIndex;
			// update maxi or an index varibale basis on count
			if (oneCount != 0 && oneCount >max) {
				// hosakt h k current row hie ans ho
				max = oneCount;
				maxOneWaliRowIndex = row ;
			}
			
		}
		return maxOneWaliRowIndex;
		
	}
};
