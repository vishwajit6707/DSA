// Climbing Stairs.
// Leetcode Link - https://leetcode.com/problems/climbing-stairs/

// Time Complexity - O(N).
// Space Complexity - O(N).


class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp = new int[n+1];
        return helper(n);
    }
    public int helper(int n){
        if(dp[n] != 0) return dp[n];
        if(n < 3) return n;
        else return dp[n] = helper(n - 1) + helper(n - 2);
    }
}
