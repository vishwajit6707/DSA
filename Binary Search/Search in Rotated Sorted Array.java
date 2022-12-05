// Search in Rotated Sorted Array.
// Leetcode Link - https://leetcode.com/problems/search-in-rotated-sorted-array/

// Time Complexity - O(NLogN).
// Space Complexity - O(1).

class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int mid  = 0;
        while(i<=j){
             mid = (i+j)/2;
            if(nums[mid]>=nums[0]){
                if(mid == nums.length-1) {
                    break;
                }
                if(nums[mid+1]<nums[mid]){
                    break;
                } 
                else i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        int a  = bSearch(nums,mid+1,nums.length-1,target);
        if(a != -1) return a;
        return bSearch(nums,0,mid,target);
    }
    public int bSearch(int arr[],int i,int j,int target){
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }
}
