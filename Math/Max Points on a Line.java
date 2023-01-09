// Max Points on a Line
// https://leetcode.com/problems/max-points-on-a-line/

// Time Complexity - O(N^2).
// Space Complexity - O(N).

class Solution {
    public int maxPoints(int[][] points) {
        if(points.length <= 2) return points.length;
        int max = 0;
        for(int[] point1 : points){
            HashMap<Double,Integer> map = new HashMap<>();
            for(int[] point2 : points){
                if(point1 == point2) continue;
                double slop = 0;
                if(point1[0] == point2[0]) slop = Double.POSITIVE_INFINITY;
                else{
                    slop = (double)(point2[1] - point1[1])/ (double)(point2[0] - point1[0]);
                }
                map.put(slop,map.getOrDefault(slop,0)+1);
                if(map.get(slop)>max) max = map.get(slop);
            }
        }
        return max+1;
    }
}
