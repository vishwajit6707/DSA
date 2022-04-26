//https://leetcode.com/problems/binary-search/


class Solution {
    public int search(int[] nums, int target) {
       int left =0 ;
       int right = nums.length- 1;
        
       
        
     while(left<=right){
         int mp = (left+right)/2;
         if(nums[mp]==target) return mp;
         if(target>nums[mp]) {
           left = mp +1;
         }
         else{
             right = mp -1;
         }
     }
        return -1;
    }
}
