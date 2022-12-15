// Longest Common Subsequence.
// Leetcode Link - https://leetcode.com/problems/longest-common-subsequence/

class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new Integer[text1.length()][text2.length()];
        return helper(text1, text2, 0, 0);
    }
    public int helper(String text1, String text2, int i, int j){
        if(i == text1.length()  || j == text2.length()) return 0;
        if(dp[i][j] != null) return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)) return dp[i][j] = 1 + helper(text1,text2,i+1,j+1);
        else return dp[i][j] =  Math.max(
            helper(text1,text2,i+1,j),
            helper(text1,text2,i,j+1)
        );
    }
}
