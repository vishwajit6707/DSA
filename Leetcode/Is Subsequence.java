//https://leetcode.com/problems/is-subsequence/


//Time Complexity O(N^2).
//Brute Force Approach.

class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        int m = 0;
        for(int i =0 ; i<s.length(); i++){
            for(int j = m ; j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    m = j+1;
                k = k+1;
                 break;
                }
            }
        }
        return k==s.length() ? true : false;
    }   
}


//Using Stack

class Solution {
    public boolean isSubsequence(String s, String t) {
     Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        for(int i = t.length() - 1; i>=0 ; i--){
            if(!stack.empty() && stack.peek()==t.charAt(i)){
                stack.pop();
            }
        }
        return stack.empty();
    }
}
