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
    int res = 0 ;// globle varible 
    public int diameterOfBinaryTree(TreeNode root) {

        dfs(root);
        return res ;

        
    }
    private int dfs(TreeNode root){

        // if root is null 
        if(root==null){
            return 0;

        }
        int l = dfs(root.left); // root left  varible create 
        int r = dfs(root.right);  // root right varible create 

        res = Math.max(res,l+r);  // compare both side 

        return 1 + Math.max(l,r); // 1+ isliye root se chalu hua isliye then return 
     }
}