// Guess Number Higher or Lower
// Leetcode Link - https://leetcode.com/problems/guess-number-higher-or-lower/


// Time Complexity - O(NLogN).
// Space Complexity - O(1).

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    int left = 1;
    int right  = n;
    while(left<=right){
        int mid = left + (right - left)/2;
        if(guess(mid) == 0) return mid;
        else if(guess(mid) == -1){
            right = mid - 1;
        }else if(guess(mid)==1){
            left = mid + 1;
        }
    }
    return -1;
    }
}
