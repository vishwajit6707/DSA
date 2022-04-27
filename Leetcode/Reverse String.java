//https://leetcode.com/problems/reverse-string/

//Time Complexity - O(N).


class Solution {
    public void reverseString(char[] s) {
        char k[] = new char[s.length];
        for(int i = 0; i<s.length;i++){
            k[i]=s[i];
        }
        int j = s.length-1;
        for(int i = 0; i<s.length;i++){
            s[i]=k[j--];
        }
    }
}


//second Approach 

class Solution {
    public void reverseString(char[] s) {
       int start = 0; 
       int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
