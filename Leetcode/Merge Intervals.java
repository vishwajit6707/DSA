// Merge Intervals.
// Leetcode Link - https://leetcode.com/problems/merge-intervals.

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> al = new ArrayList<>();
        for(int i = 0;i<intervals.length ;i++){
            if(intervals[i][0] <= end && al.size()>0){
                end = Math.max(intervals[i][1],end);
                al.get(al.size()-1)[1] = end;
                
            }else{
                al.add(new int[]{intervals[i][0], intervals[i][1]});
                end = Math.max(intervals[i][1],end);
            }
        }
        int[][] ans = new int[al.size()][2];
        for(int i = 0; i<al.size(); i++){
            ans[i][0] = al.get(i)[0];
            ans[i][1] = al.get(i)[1];
        }
        return ans;
    }
}
