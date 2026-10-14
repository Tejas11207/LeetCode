class Solution {

    
    public int[] dailyTemperatures(int[] temperatures) {

        // with the stack 
        // tc= O(n)
        // optimal 

        int n = temperatures.length;
        int ans[] = new int[n];

        Deque<Integer> st = new ArrayDeque<>();


        for(int i =0; i <n;i++){

            // for each index , we will findans using stack 

            while(!st.isEmpty() &&  temperatures[i] > temperatures[st.peek()]){

                // i found a warmer day 

                int previousDay = st.pop();

                ans[previousDay] = i-  previousDay;

            }
            // after all this poping , mujhe current temp toh insert krna hi hai n
            st.push(i);


        }
        return ans ;


        // // this is brute force solution -- tc O(n^2);

        // int n = temperatures.length;

        // int[] ans = new int[n];

        // for (int i = 0; i < n; i++) {

        //     //for index i we want to findthe ans 
        //     //for each index , i move to  the right direction and search for the warmer days 
        //     // and take differences of indexes to get number of days and we can store in it the ans array;

        //     for (int j = i + 1; j < n; j++) {

        //         if (temperatures[j] > temperatures[i]) {
                    
        //             //warmer days;

        //             int days = j - i;

        //             ans[i] = days;
        //             break;
        //         }

        //     }
        // }
        // return ans;

    }
}