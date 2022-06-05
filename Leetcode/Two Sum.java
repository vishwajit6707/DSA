
//https://leetcode.com/problems/two-sum/
//Brute force
//Time Complexity - O(N^2).

class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] k = new int[2];
        for( int i = 0 ; i<nums.length; i++){
            for( int j = i+1 ; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    k[0] = i;
                    k[1] =j;
                       break;
                }
            }
        }
          return k;  
    }
}


//Optimal approach 
//time complexity O{N}.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];     
	    Map<Integer , Integer> cane = new HashMap<>();
	    for(int i = 0 ; i<nums.length; i++) {
	    	if(cane.containsKey(target - nums[i])) {
	    		ans[0] = i ;
	    		ans[1] = cane.get(target - nums[i]);
	    		return ans;
	    	}
	    	cane.put(nums[i], i);  	
	    }	
		return ans;
    }
}
