//https://leetcode.com/problems/plus-one/

class Solution {
 public int[] plusOne(int[] digits) {
      for(int i = digits.length-1 ; i>=0 ; i--) {
          if(digits[i]!=9){
              digits[i]++;
              break;
          }
          else if (digits[i]==9 && i==0) {
              digits[i] =0;
		      int result[] = new int[digits.length+1];
			  result[0] = 1;
			   for(int j = 1; j<digits.length; j++) {
                   result[j] = digits[j-1];
               }
              return result;
          }
          else{
              digits[i]=0;
          }
      }
              return digits; 
 }
}
     
			
              
					
     
				
    
     
     
         
              
					
					
				
				
