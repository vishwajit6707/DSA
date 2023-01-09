// Maximal Score After Applying K Operations.
// Leetcode Link - https://leetcode.com/problems/maximal-score-after-applying-k-operations/

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long total = 0;
        for(int x : nums) queue.add(x);
        for(int i = 0; i<k; i++){
            if(!queue.isEmpty()){
                int temp = queue.poll();
                total += temp;
                queue.add((int)Math.ceil((double)temp/3));
            }
        }
        return total;
    }
}
