// Determine if Two Strings Are Close.
// Leetcode Link - https://leetcode.com/problems/determine-if-two-strings-are-close/


class Solution {
    int n = 26;
    public boolean closeStrings(String word1, String word2) {
        char[] ch1 = new char[n];
        char[] ch2 = new char[n];

        for(char ch :word1.toCharArray()){
            ch1[ch-'a']++;
        }
        for(char ch :word2.toCharArray()){
            ch2[ch-'a']++;
        }
        for(int i =0; i<n ;i++){
            if(ch1[i] != ch2[i] && (ch1[i]==0 || ch2[i] == 0)) return false;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i =0; i<n ;i++){
            if(ch1[i]!=ch2[i]) return false;
        }
        return true;
    }
}
