//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

class Solution {
    public String removeDuplicates(String s, int k) {
        int count = 1;
        for(int i =1; i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count==k){
                String reduced = s.substring(0,i-k+1) +s.substring(i+1);
                return removeDuplicates(reduced,k);
            }
        }
        return s;
    }
}
