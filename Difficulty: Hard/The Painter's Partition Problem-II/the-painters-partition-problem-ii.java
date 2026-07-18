class Solution {
	
	static boolean isvalidans(int arr[], int k, int maxlength) {
		// mid ->max length bords (s) ,a pointer can paint
		// > than that is allowl
		// mid ->maxlength;
		
		int paintercount = 1;
		int paintedlength = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (paintedlength + arr[i] <= maxlength) {
				// assing the  boards to pointer
				paintedlength += arr[i];
				
			}
			else {
				// paintedlength +boards[i]>maxlength
				// limit breach;
				paintercount++;
				paintedlength = 0;
				if (paintercount >k || arr[i]>maxlength) {
					return false ;
					
				}
				else {
					// na toh pointercount me koi dikkat hai ;
					// na toh maxlength me koi dikkat aayi hai ;
					// assign current boards to current pointer;
					
					paintedlength += arr[i];
				}
			}
			
		}
		return true;
	}
	
	public int minTime(int[] arr, int k) {
		// code here
		int sum = 0 ;
		
		for (int i = 0 ; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int s = 0;
		int e = sum ;
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (isvalidans(arr, k, mid)) {
				ans = mid;
				e = mid - 1;
			}
			else {
				// not valide ;
				s = mid + 1;
				
			}
			
		}
		return ans ;
		
	}
}
