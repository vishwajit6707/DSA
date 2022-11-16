// Next Greater Element I
// Leetcode Link - https://leetcode.com/problems/next-greater-element-i/

// Time Complexity - O(N).
// Space Complexity - O(N).

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[nums2.length];
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i = nums2.length-1 ; i>= 0 ; i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            if(!st.isEmpty()){
              arr[i] = st.peek();  
            } 
            else{
                arr[i] = -1;
            }
            st.push(nums2[i]);
        }
        //for storing the index of the elements from nums1
        for(int i = 0; i<nums1.length ; i++){
            map.put(nums1[i],i);
        }

        int ans[] = new int[nums1.length];
        for(int i = 0; i<nums2.length ; i++){
            if(map.containsKey(nums2[i])) ans[map.get(nums2[i])] = arr[i];
        }
        return ans;
    }
}
