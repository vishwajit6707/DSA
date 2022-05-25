https://leetcode.com/problems/pascals-triangle/



class Solution {
public  List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	 List<Integer> pre = new ArrayList<Integer>();
          for(int i = 1 ; i<=numRows ; i++) {
         	 List<Integer> cane = new ArrayList<Integer>();

        	  for(int j =1 ; j<=i ; j++) {
        		  if(j == 1 || j == i ) {
        			  cane.add(1); 
        		  }
        		  else {
        			  cane.add(pre.get(j-2)+pre.get(j-1));
        		  }
        		  
        	  }
        	  pre = cane;
        	  ans.add(cane);
          }
	return ans;
	 }
}
