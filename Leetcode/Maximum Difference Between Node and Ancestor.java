// Maximum Difference Between Node and Ancestor.
// Leetcode Link - https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

// Time Complexity - O(N).
// Space Complexity - O(N). Because we need a stack to do recursion.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {
        traverse(root,root.val,root.val);
        return maxDiff;
    }
    public void traverse(TreeNode root,int min, int max){
        if(root == null) {
            if(maxDiff < Math.abs(max - min)) maxDiff = Math.abs(max - min);
            return;
        }
        min = Math.min(min,root.val);
        max = Math.max(max,root.val);
        traverse(root.left,min,max);
        traverse(root.right,min,max);
    }
}
