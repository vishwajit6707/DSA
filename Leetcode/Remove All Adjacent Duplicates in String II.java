//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
//due to many steps TLE error.


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

//Better Approach...


class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> main = new Stack<>();
        for(char c : s.toCharArray()){
            if(!main.isEmpty() && main.peek()[0]==c){
                main.peek()[1]++;
            }
            else{
                main.push(new int[]{c,1});
            }
            if(main.peek()[1]==k){
                main.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        while(!main.isEmpty()){
            int[] top = main.pop();
            
            while(top[1]-->0){
                result.append((char) top[0]);
            }
            
        }
        return result.reverse().toString();
    }
}class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> main = new Stack<>();
        for(char c : s.toCharArray()){
            if(!main.isEmpty() && main.peek()[0]==c){
                main.peek()[1]++;
            }
            else{
                main.push(new int[]{c,1});
            }
            if(main.peek()[1]==k){
                main.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        while(!main.isEmpty()){
            int[] top = main.pop();
            
            while(top[1]-->0){
                result.append((char) top[0]);
            }
            
        }
        return result.reverse().toString();
    }
}
