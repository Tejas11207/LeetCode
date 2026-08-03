class Solution {
    public int fib(int n) {

        // base condition define kri 
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // recursion kr diya recursive relation ko use kr ke 
        int ans = fib(n - 1) + fib(n - 2);
        return ans;
    }
}