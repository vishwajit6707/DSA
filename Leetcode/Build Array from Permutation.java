//https://leetcode.com/problems/build-array-from-permutation/

//Time Complexity - O(N).

class Solution {
    public int[] buildArray(int[] nums) {
        int[] nn = new int[nums.length];
        for(int i = 0 ; i<nums.length; i++){
            nn[i] = nums[nums[i]];
        }
        return nn;
    }
}
