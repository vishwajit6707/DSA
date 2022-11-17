// Rectangle Area.
// Leetcode Link - https://leetcode.com/problems/rectangle-area/

// Time Complexity - O(N).
// Space Complexity - O(N).

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaF = (ay2 - ay1) * (ax2 - ax1);
        int areaS = (by2 - by1) * (bx2 - bx1);
        int total = areaF + areaS;
        int vert = Math.min(ay2 ,by2) - Math.max(ay1,by1);
        int hori = Math.min(ax2, bx2) - Math.max(ax1,bx1);
        if(vert > 0 &&  hori > 0){
            total = total - (vert * hori);
        }
        return total;
    }
}
