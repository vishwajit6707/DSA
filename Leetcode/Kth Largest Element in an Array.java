// Kth Largest Element in an Array
// Leetcode Link - https://leetcode.com/problems/kth-largest-element-in-an-array/

// Approach - Solved Using Priority Queue.

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length ; i++){
            if(pq.size()<k) pq.add(nums[i]);
            else{
                if(pq.peek()<nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}
