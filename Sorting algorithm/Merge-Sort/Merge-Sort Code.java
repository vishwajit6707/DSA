//Merge sort
//Time Complexity - NlogN
//Space Complexity - N.


class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        divide(0,nums.length-1,nums);
        return nums;
    }
    public void divide(int start,int end,int[] nums) {
		if(start>=end) return;
		int mid = start + ( (end - start)/2 );
		divide(start, mid , nums);
		divide(mid+1, end, nums);
		conquar(start,mid,end,nums);
	}
	public void conquar(int start ,int mid, int end ,int nums[]) {
		int merged[] = new int[end-start+1];
		int i = start;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j<=end) {
			if(nums[i] <= nums[j]) {
				merged[k++] = nums[i++];
			}else {
				merged[k++] = nums[j++];
			}
		}
		while(i<=mid) {
			merged[k++] = nums[i++];
		}
		while(j<=end) {
			merged[k++] = nums[j++];
		}
		
		for(int m = 0 , n = start ; m <merged.length ; m++ , n++) {
			nums[n] = merged[m];
		}
	}
}

