// Climbing Stairs.
// Leetcode Link - https://leetcode.com/problems/climbing-stairs/

// Top Down Approach - Memoization.

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

// Bottom Up Approach.

// Time Complexity - O(N).
// Space Complexity - O(N).


class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        if(n <= 2) return n;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}


// Bottom Up Approach. With Space Optimization.

// Time Complexity - O(N).
// Space Complexity - O(1).


class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int ft = 1;
        int snd = 2;

        for(int i = 3 ; i<=n ; i++){
            int temp = ft;
            ft = snd;
            snd = snd + temp;
        }

        return snd;
    }
}
