// Fibonacci Number.
// Leetcode Link - https://leetcode.com/problems/fibonacci-number/

class Solution {
    int dp[];
    public int fib(int n) {
        dp = new int[n+1];
        return ans(n);
    }
    public int ans(int n){
        if(dp[n] != 0) return dp[n];
        if(n == 0) return 0;
        if(n == 1)return 1;
        return dp[n] = ans(n-1) + ans(n-2);
    }
}
