// Minimum Average Difference.
// Leetcode Link - https://leetcode.com/problems/minimum-average-difference/


class Solution {
    public int minimumAverageDifference(int[] nums) {

        int min = Integer.MAX_VALUE;
        int index = 0;
        int len = nums.length;

        long arr[] = new long[len];
        for(int i =0; i<len; i++){
            if(i==0) arr[0] = nums[0];
            else arr[i] = arr[i-1] + nums[i]; 
        }

        long arr2[] = new long[len];
        for(int i = len-1 ; i>=0 ; i--){
            if(i==len-1) arr2[i] = nums[i];
            else arr2[i] = arr2[i+1] + nums[i];
        }

        for(int i  = 0; i<len ; i++){
            long stAvg = arr[i] / (i+1);
            long lstAvg = 0;
            int avg = (int) stAvg;
            if(i!=len-1){
                lstAvg = arr2[i+1]/ (len-(i+1));
                avg  = (int) Math.abs(stAvg -  lstAvg);
            }
            if(avg < min){
                min = avg;
                index = i;
            } 
         }
         
         return index;
    }
}
