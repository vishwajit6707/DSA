//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

//Time Complexity - O(N Log N).

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double count = 0d;
        for(int i =1; i<salary.length-1;i++){
            count = count + salary[i];
        }
        double result = count/(salary.length-2);
        return result;
    }
}
