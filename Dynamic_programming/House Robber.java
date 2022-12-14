// House Robber.
// Leetcode Link - https://leetcode.com/problems/house-robber/

// Approach - Dynamic Programming.

// Top Down (Memoization).
// Time Complexity - O(N).
// Space Complexity - O(N).


class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
    public int helper(int nums[], int pt){
        if(pt >  nums.length-1) return 0;
        if(dp[pt] != -1) return dp[pt];
        return dp[pt] = Math.max(nums[pt] + helper(nums,pt+2) , helper(nums,pt+1));
    }
}

// Bottom Up - iterative
// Time Complexity - O(N).
// Space Complexity - O(1).

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int ft = 0;
        int st = nums[0];
        for(int i = 1; i<nums.length ; i++){
            int temp = Math.max(st,ft + nums[i]);
            ft = st;
            st = temp;
        }
        return st;
    }
}
