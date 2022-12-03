// Binary Tree Postorder Traversal.
// Leetcode Link - https://leetcode.com/problems/binary-tree-postorder-traversal/



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
    List<Integer> al = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        ans(root);
        return al;
    }
    public void ans(TreeNode root){
        if(root == null) return;
        if(root.left != null) postorderTraversal(root.left);
        if(root.right != null) postorderTraversal(root.right);
        al.add(root.val);
    }
}
