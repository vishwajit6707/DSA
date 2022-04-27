//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
//Time Complexity - O(N).

class Solution {
    public int countOdds(int low, int high) {
     int result = high - low + 1;
     if(result%2==0) return result/2 ;
     if(result%2==1 && low%2 ==1 ) result = (result/2)+1;
     if(result%2==1 && low%2 ==0 ) result = (result/2);
     return result;
    }
}
