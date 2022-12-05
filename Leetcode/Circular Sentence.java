// Circular Sentence.
Leetcode Link - https://leetcode.com/problems/circular-sentence/

class Solution {
    public boolean isCircularSentence(String sentence) {
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i)==' ' && i>1 && i<sentence.length()-1){
                if(sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
            }
        }
        if(sentence.charAt(sentence.length()-1) != sentence.charAt(0)) return false;
        return true;
    }
}
