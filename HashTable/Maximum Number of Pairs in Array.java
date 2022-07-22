//Maximum Number of Pairs in Array.java
//https://leetcode.com/problems/maximum-number-of-pairs-in-array/


class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer> ht = new HashSet<Integer>();
        int arr[] = new int[2];
        int count = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(ht.contains(nums[i])){
                ht.remove(nums[i]);
                count++;
            }else{
                ht.add(nums[i]);
            }
        }
        
        arr[0] = count;
        arr[1] = ht.size();
        return arr;
    }
}
