//https://leetcode.com/problems/132-pattern/


//Time complexity - O(N^3)     TLE error 


class Solution {
    public boolean find132pattern(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
           for(int j = i+1; j<nums.length-1; j++ ){
               for(int k= j+1; k<nums.length; k++){
                   if(nums[i]<nums[k] && nums[k]<nums[j]){
                       return true;
                   }
               }
            }
         }
        return false;
    }
}

/// Time complexity - O(N^2)   TLE error.

class Solution {
    public boolean find132pattern(int[] nums) {
        int min = nums[0];
        for(int j = 0; j<nums.length-1; j++){
            for(int k = j+1 ; k<nums.length ; k++){
                if(nums[k]>min && nums[j]>nums[k]) return true;
                min = Math.min(min,nums[j]);
            }
        }
        return false;
    }
}


//Time Complexity - O(N)   - using stack..  || Best Approach..


class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int thirdElement = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]<thirdElement) return true;
            while(!st.isEmpty() && st.peek() < nums[i] ) thirdElement = st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}
