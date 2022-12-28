// Remove Stones to Minimize the Total
// Leetcode Link - https://leetcode.com/problems/remove-stones-to-minimize-the-total/

// Approach - Using Max Heap.

class Solution {
    public int minStoneSum(int[] piles, int k) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<piles.length ; i++){
            pq.add(piles[i]);
        }
        while(k > 0 && !pq.isEmpty() && pq.peek() != 0){
            int a = pq.poll();
            pq.add(a - a/2);
            k--;
        }
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        return ans;
    }
}
