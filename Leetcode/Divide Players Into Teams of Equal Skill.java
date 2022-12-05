// Divide Players Into Teams of Equal Skill/
// Leetcode Link - https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/

// Time Complexity - O(NLogN).
// Space Complexity - O(1).

class Solution {
    public long dividePlayers(int[] skill) {
        long ans = 0;
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length-1;
        int avg = skill[0] + skill[skill.length-1];
        while(i < j){
            if(skill[i] + skill[j] != avg) return -1;
            ans += skill[i] * skill[j];
            i++;
            j--;
        }
        return ans;
    }
}
