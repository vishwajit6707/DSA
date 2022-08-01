// Unique Paths
// https://leetcode.com/problems/unique-paths/

// brute force approch ... Gives TLE..

class Solution {
    public int uniquePaths(int m, int n) {
       int ans = cane(n,m,1,1);
       return ans; 
    }
    public int cane(int n, int m, int left, int down){
        if(down == m && left == n){
            return 1;
        }
        else if(down == m){
            return 1;
        }
        else if(left == n){
            return 1;
        }
        return cane(n,m,left+1,down) + cane(n,m,left,down+1) ;
    }
}

//Memoization technique - Accepeted 

class Solution {
    public int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return cane(m , n , 1, 1);
    }
    public int cane(int m, int n, int right , int down) {
        if(right == m || down == n) return 1;
        else if(dp[right][down] > 0) return dp[right][down];
        return dp[right][down] = cane(m , n , right+1, down) + cane(m , n, right, down+1);
    }
}

