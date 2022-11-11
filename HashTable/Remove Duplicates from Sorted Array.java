// Remove Duplicates from Sorted Array
// Leetcode Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int pt = 0;
        for(int i = 0; i<nums.length ; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[pt++] = nums[i];
            }
        }
        return hs.size();
    }
}
