//https://leetcode.com/problems/palindrome-number/
//Time Complexity = O(N)

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int temp =0;
        int m = x;
        int rem;
        while(x>0){
            rem = x%10;
            temp = temp *10  + rem;
            x = x/10;
        }
        return temp==m ? true:false;
    }
}
