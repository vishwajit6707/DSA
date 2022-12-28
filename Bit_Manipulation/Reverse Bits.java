// Number of 1 Bits.
// Leetcode Link - https://leetcode.com/problems/reverse-bits/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i<32 ; i++){
            ans <<= 1;
            if((n & 1) ==1 ) ans = ans | 1;
            n >>= 1;
        }
        return ans;
    }
}
