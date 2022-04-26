//https://leetcode.com/problems/contains-duplicate/

//Time Complexity - O(N)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> solve = new HashSet<Integer>();
        for(int i = 0 ; i<nums.length; i++){
            solve.add(nums[i]);
        }
        return solve.size()!=nums.length ? true:false;
    }
}
