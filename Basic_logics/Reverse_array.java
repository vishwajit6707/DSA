

import java.util.*;
public class AS {
	public static void reverse(int[] n) {
		int start = 0;
		int end = n.length-1;
		while(start<end) {
		   int temp = n[start];
		   n[start] = n[end];
		   n[end] = temp;
		   end--;
		   start++;
		}
	}
	public static void main(String[] args) {
	  int k[] = {1,2,3,4,5,44,2,3};
	  reverse(k);
	  System.out.println(Arrays.toString(k));
	}
}

