// Sort Characters By Frequency.
// Leetcode Link - https://leetcode.com/problems/sort-characters-by-frequency/

// Time Complexity - O(N).
// Space Complexity - O(N).

class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character> al = new ArrayList<>();
        for(char ch : map.keySet()){
            al.add(ch);
        }
        Collections.sort(al,(a,b) -> map.get(b) - map.get(a));
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<al.size(); i++){
            for(int j = 0 ; j<map.get(al.get(i)); j++){
                ans.append(al.get(i));
            }
        }
        return ans.toString();
    }
}
