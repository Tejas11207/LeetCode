// class Solution {    

//     public static void findNextSmallesIndex(int[] heights ,int prev[]){

//         Deque<Integer> st = new ArrayDeque<>();

//         int n = heights.length;

//         // next smaller -> right to left

//         // prev smaller -> left to right

//         for(int i = 0;i<heights.length-1 ; i++){
//             // useless element pop 
//             int currIndex = i ;
//             while(!st.isEmpty&& arr[st.peek()] >= arr[currIndex]){

//                 st.pop();

//             } if(st.isEmpty()){

//                 prev[i] = -1;


//             }
//             else {
//                 // stack k top pr koi useful element ka index 
//               prev[i] = st.peek();



//             }

//             st.push(currIndex);


        

//         }
//     }
//     public static void findNextSmallesIndex(int[] heights ,int next[]){

//         Deque<Integer> st = new ArrayDeque<>();

//         int n = heights.length;

//         // next smaller -> right to left

//         // prev smaller -> left to right

//         for(int i = heights.length-1;i>=0 ; i--){
//             // useless element pop 
//             int currIndex = i ;
//             while(!st.isEmpty && arr[st.peek()] >= arr[currIndex]){

//                 st.pop();

//             } if(st.isEmpty()){

//                 next[i] = n;

//             }
//             else {
//                 // stack k top pr koi useful element ka index 
//                 next[i] = st.peek();


//             }

//             st.push(currIndex);


        

//         }
//     }
   
   
//     public int largestRectangleArea(int[] heights) {


//         //there 2 arrays will store indexes 

//         int prev[] = new int[heigths.length];
//         int next []= new int[heights.length];

//         findPreviousSmallerIndex(heigths,prev);

//         findNextSmallesIndex(heights);

//         int maxArea=-1;

//         for(int i =0; i< heights.length;i++){

//             int heigth = arr[i];

//             int width = next[i];

//             int area = heigth * width;

//             maxArea = Math.max(maxArea,area);


//         }
//         return maxArea;

        
//     }
// }

class Solution {

    public static void findPreviousSmallerIndex(int[] heights, int[] prev) {

        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }

            st.push(i);
        }
    }

    public static void findNextSmallerIndex(int[] heights, int[] next) {

        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }

            st.push(i);
        }
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        findPreviousSmallerIndex(heights, prev);
        findNextSmallerIndex(heights, next);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height = heights[i];
            int width = next[i] - prev[i] - 1;

            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
