// Daily Temperatures.
// Leetcode Link - https://leetcode.com/problems/daily-temperatures/

// Approach - Monotonic Stack.
// Space Complexity - O(N).
// Time Complexity - O(N).

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = temperatures.length-1 ; i>=0; i--){
           while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
               st.pop();
           }
           if(!st.isEmpty()) ans[i] = st.peek() - i;
           st.push(i);
        }
        return ans;
    }
}
