// Minimum Falling Path Sum.
// Leetcode Link - https://leetcode.com/problems/minimum-falling-path-sum/

// Approach Dynamic Programming.

class Solution {
    int dp[][];
    public int minFallingPathSum(int[][] matrix) {
        dp = new int[matrix.length+1][matrix[0].length+1];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<matrix[0].length ; i++){
            min = Math.min(helper(matrix,i,0),min);
        }
        return min;
    }
    public int helper(int[][] matrix, int n,int st){
        if(dp[st][n] != 0) return dp[st][n];
        if(st == matrix.length) return 0;
        int center =  helper(matrix,n, st+1);
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(n > 0)                  left =   helper(matrix,n-1, st+1);
        if( n < matrix[0].length - 1) right =  helper(matrix, n+1, st+1);
        return dp[st][n] = matrix[st][n] + Math.min(center,Math.min(left,right));
    }
}
