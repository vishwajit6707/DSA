// https://leetcode.com/problems/search-a-2d-matrix-ii/
// Total 3 Approches written...


//Brute Force Algorithm.

//time Complexity O(N^2).

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length ; i++){
            for(int j = 0; j<matrix[0].length ; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}

//Binary Search approach 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length ; i++){
            if(matrix[i][0] > target) return false;
            
            int start  = 0;
            int end = matrix[i].length-1;
            
            
            while(start<=end){
                int mid = start + (end - start)/2;
                if(matrix[i][mid] == target){
                    return true;
                } 
                if(matrix[i][mid] < target){
                    start = mid + 1;
                } 
                else{
                    end = mid - 1;
                }
            }            
        }
        return false;
    }
}


//optimal Approach. 
// Time Complexity -> O(M+N)----> O(N).

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1  ) return false;
        int row = matrix.length-1;
        int column = 0;
        while(row >= 0 && column <= matrix[0].length-1){
            if(matrix[row][column] == target) return true;
            if(matrix[row][column] > target) row--;
            else if(matrix[row][column] < target) column++;
        }
        return false;
    }
}







