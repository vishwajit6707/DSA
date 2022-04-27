//https://leetcode.com/problems/climbing-stairs/


//Dynamic Programming (Recursion + Memoization)

class Solution {
    public int climbStairs(int n) {
     int k[] = new int[n+1];
        return ll(n , k);
        }

       public int ll(int n, int[] k) {
        if(n == 0 || n ==1 || n ==2  ) return n ;
        if(k[n]==0){
            return k[n] = ll(n-1, k) + ll(n-2, k);
        }
           
        return k[n];
        }
}
