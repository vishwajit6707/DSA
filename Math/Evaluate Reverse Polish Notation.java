// Evaluate Reverse Polish Notation.
// Leetcode Link - https://leetcode.com/problems/evaluate-reverse-polish-notation/

// Time Complexity - O(N).
// Space Complexity - O(N).

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<tokens.length ; i++){
            if(tokens[i].charAt(0) == '+'){
                int ft = st.pop();
                int snd = st.pop();
                st.push(snd + ft);
            }
            else if(tokens[i].charAt(0) == '-' && tokens[i].length() == 1){
                int ft = st.pop();
                int snd = st.pop();
                st.push(snd - ft);
            }
            else if(tokens[i].charAt(0) == '*'){
                int ft = st.pop();
                int snd = st.pop();
                st.push(snd * ft);
            }
            else if(tokens[i].charAt(0) == '/'){
                int ft = st.pop();
                int snd = st.pop();
                st.push(snd / ft);
            }
            else if(tokens[i].charAt(0) == '-' && tokens[i].length() > 1){
                int temp = 0;
                for(int j = 1; j<tokens[i].length() ; j++){
                    temp = (temp * 10) + (tokens[i].charAt(j) - '0');
                }
                temp = -1 * temp;
                st.push(temp);
            }
            else{
                int temp = 0;
                for(int j = 0; j<tokens[i].length() ; j++){
                    temp = (temp * 10) + (tokens[i].charAt(j) - '0');
                }
                st.push(temp);
            }            
        }
        return st.peek();
    }
}
