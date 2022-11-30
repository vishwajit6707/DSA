// Unique Number of Occurrences.
// Leetcode Link - https://leetcode.com/problems/unique-number-of-occurrences/

// Time Complexity - O(N).
// Space Complexity - O(N).

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int y : map.values()){
            if(hs.contains(y)) return false;
            hs.add(y);
        }
        return true;
    }
}
