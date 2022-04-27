//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//Brute Force Approach

//Time Complexity - O(N^2)


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
     int k[] = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++ ){
                if(nums[i]>nums[j]){
                    count++;
                   }
                
            }   
          k[i] = count;     
      }
        return k;
    }
}
