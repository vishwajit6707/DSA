//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> p = new Stack<Character>();
        StringBuilder ans = new StringBuilder();
        
         for(int i = 0; i<s.length();i++){
           if(!p.isEmpty() && s.charAt(i)==p.peek()){
               p.pop();
           }
             else{
                 p.push(s.charAt(i));
             }
         }
       while(!p.isEmpty()){
          ans.append(p.pop());
       }
        return ans.reverse().toString();
    }
}
