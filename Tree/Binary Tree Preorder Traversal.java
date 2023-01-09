// Leetcode Link - https://leetcode.com/problems/binary-tree-preorder-traversal/
// Time Complexity - O(N).
// Space Comlexity - O(N).

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        helper(root,al);
        return al;
    }
    public void helper(TreeNode root,List<Integer> al){
        if(root == null) return;
        al.add(root.val);
        helper(root.left, al);
        helper(root.right, al);
    }
}
