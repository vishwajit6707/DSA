//https://leetcode.com/problems/running-sum-of-1d-array/
//Time Complexity - O(N).

class Solution {

    public int[] runningSum(int[] nums) {
        int[] kk = new int[nums.length];
        kk[0] = nums[0];
        for(int i = 1  ; i < nums.length; i++){
          kk[i]= kk[i-1] + nums[i];
        }
     
        return kk;
    }
}
