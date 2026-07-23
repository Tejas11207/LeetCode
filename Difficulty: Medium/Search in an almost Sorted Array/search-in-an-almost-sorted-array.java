class Solution {
	public int findTarget(int arr[], int target) {
		
		int n = arr.length;
		int s = 0;
		int e = n - 1; // index
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (arr[mid] == target) {
				return mid ;
				
			}
			if (mid + 1 < n && arr[mid + 1] == target) {
				// ye condition isliye lagai hai kyu ki arr[mid+1] < n  mera arraya outof bound na chala jaye;
				// arr[mid+1] array ke aandhar hie  rahega
				return mid + 1;
			}
			if (mid - 1 >= 0 && arr[mid - 1] == target) {
				// ye condition isliye lagai hai kyu ki arr[mid-1] >=0  mera arraya outof bound na chala jaye;
				// koi neg. no. na aajaye ;
				return mid - 1;
			}
			// if mera mid ,mid+1,mid-1  target ke equal nhi ha toh left or right me  check kro
			if (arr[mid]>target) {
				e = mid - 2; // end = mid-2 isliye because humne ne phele hie mid-1 check kr liya hai
				// code jaya optimise lagega
				// left me jayo
			}
			else {
				s = mid + 2; // start = mid+2 isliye because humne ne phele hie mid+1 check kr liya hai
				// code jaya optimise lagega
				// right me  me jayo
			}
			
		}
		return -1; // as pr condtion
	}
}
