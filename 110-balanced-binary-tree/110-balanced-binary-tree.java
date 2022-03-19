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
class Solution 
{
    public boolean check = true;
    
    public boolean isBalanced(TreeNode root) 
    {   
        findDepth(root);
        
        if (check)
        {
           return true; 
        }
        else
        {
            return false;
        }
    }
    
    public int findDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        
        int depthLeft = findDepth(root.left);
        int depthRight = findDepth(root.right);
        
        // System.out.println("Left: " + depthLeft + " val: " + root.val + " Right: " + depthRight); 
        
        if (Math.abs(depthLeft - depthRight) > 1)
        {
            check = false;
            return 0; 
        }
        
        return 1 + Math.max(depthLeft, depthRight);
    }
}