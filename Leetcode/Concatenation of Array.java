https://leetcode.com/problems/concatenation-of-array/
//Time Complexity - O(N).

class Solution {
    public int[] getConcatenation(int[] nums) {
     int result[] =new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            result[i]= nums[i];
        }
        int k = 0;
        for(int j = nums.length; j<(nums.length*2); j++){
           result[j] = nums[k++];
        }
        return result;
    }
}
