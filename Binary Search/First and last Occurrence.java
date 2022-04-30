

public class binary {
	//for first occurrence
	public static int first(int nums[],int target) {
		int start = 0;
		int end = nums.length-1;
	int result = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(mid == 0 || nums[mid]==target && target > nums[mid-1] ) {
				return mid;
				}
			else if(nums[mid]>target || nums[mid]==target)  {
					end = mid-1;
				}
			else if(nums[mid]<target) 
			{
				start = mid +1;
			}
			else {
				end = mid-1;
			}
		}

		return result;
	}
	//for last occurrence
	public static int last(int nums[],int target) {
		int start = 0;
		int end = nums.length-1;
	int result = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(mid == nums.length-1) return mid;
			if( nums[mid]==target && target < nums[mid+1] ) {
				return mid;
				}
			else if(nums[mid]>target )  {
					end = mid-1;
				}
			else if(nums[mid]<target || nums[mid]==target) 
			{
				start = mid +1;
			}
			else {
				end = mid-1;
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		int n[] = {1,1,1,3,4,4,4,4,5,6,7};
		int k = 1;
		int ans = first(n,k);
		int ans2 = last(n,k);
		System.out.println("first occurrence is " + ans);
		System.out.println("second occurrence is " +ans2);

		
	}
}
