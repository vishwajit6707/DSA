//https://leetcode.com/problems/merge-sorted-array/submissions/

//Method 1
//Time complexity N log N

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m ; i<nums1.length;i++){
       nums1[i]= nums2[j++];
        }
        Arrays.sort(nums1);
        }
    }

//Method 2
//Time Compexity = O(N)

class Solution {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        if(m == 0){
	            for(int i = 0 ; i<n; i++){
	                nums1[i]= nums2[i];
	            }
	            return;
	        }
          
	        if(n == 0) return;
          
	        int kk[] = new int[m];
	        for(int i = 0 ; i<m ; i++) {
	        	kk[i]= nums1[i];
	        }
	        int i =0 ; 
	       int j = 0  ;
	        int k =0;
	while(m>i && n>j){
	    if(kk[i]<nums2[j]){
	        nums1[k++] = kk[i++];
	    }
	    else{
	         nums1[k++] = nums2[j++];
	       }
	}
	while(m>i) {
		nums1[k++] = kk[i++];
	}
	while(n>j) {
		nums1[k++] = nums2[j++];
	}
        
    }
}

