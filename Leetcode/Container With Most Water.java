//https://leetcode.com/problems/container-with-most-water/
//Time complexity - O(N^2).    TLE error.. need to find better approach.


class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i<height.length;i++){
            for(int j = 0; j<height.length;j++)
            {
                if(height[i]>height[j]){
                  max = Math.max(max, height[j]*Math.abs(j-i));
                }
                else{
                  max = Math.max(max, height[i]*Math.abs(j-i));
                }
            }
        }
        return max;
    }
}
