//https://leetcode.com/problems/fibonacci-number/

//Dynamic Programming (Recursion + Memoization)

class Solution {
 
    
   public int a(int n, int k[]) {
	if(n == 1 || n == 0) return n;

	if(k[n]==-1) {
	    return k[n] = a(n-1, k)+ a(n-2, k);
	}
	  return k[n];
 }
	
	public int fib(int n) {
		int k[]= new int[n+1];
                for(int i =0 ; i<k.length; i++){
                      k[i]= -1;
                }
		return a(n, k);
	 }
}
