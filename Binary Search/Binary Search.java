
public class Binary_Search {

	public static int search(int nums[],int target) {
		int result = -1;
		int start = 0;
		int end  = nums.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
		}


		return result;
	}
	
	
	public static void main(String[] args) {
		int nums1[] = {1,2,3,4,5,6,7,8,9};
	    int target = 6;
	    int answer = search(nums1,target);
	    System.out.println("The number is at index : "+ answer);
	}
}
