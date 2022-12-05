// Circular Sentence.
// Leetcode Link - https://leetcode.com/problems/circular-sentence/

class Solution {
    public boolean isCircularSentence(String sentence) {
        for(int i = 1; i<sentence.length()-1; i++){
            if(sentence.charAt(i)==' ' && sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
        }
        if(sentence.charAt(sentence.length()-1) != sentence.charAt(0)) return false;
        return true;
    }
}
