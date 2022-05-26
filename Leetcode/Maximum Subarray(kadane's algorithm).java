https://leetcode.com/problems/maximum-subarray/


//brute force apprach - with TLE Error.
// Time Complexity = O(N^3).

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1 ) return nums[0];
        if(nums.length == 0 ) return 0;
        int max =Integer.MIN_VALUE;
	 	   for(int i = 0; i<nums.length; i++){
			   for(int j = i; j<nums.length;j++){
				   int count= 0;
				   for(int k = i; k<=j ;k++ ){
					   count = count + nums[k];
				   }
				   max = Math.max(max, count);
               }
           }
        return max;   
    }
}

//best approach kadane's algorithm. 
// Time Complexity = O(N).

class Solution {
    public int maxSubArray(int[] nums) {
        	 int max =nums[0];
		 int maxSofar = 0;
		 for(int i = 0; i<nums.length ; i++) {
			 maxSofar = maxSofar + nums[i];
			 if(maxSofar<nums[i]) {
				 maxSofar = nums[i];
			 }
            max =  Math.max(max,maxSofar);
		 }
		 return max;
    }
}
