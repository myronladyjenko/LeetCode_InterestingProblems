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
    TreeNode curr = null;
    TreeNode next = null;
    // storage for the second node to be swapped 
    TreeNode prev = null;
    
    public void recoverTree(TreeNode root) 
    {
        inOrder(root);
        int temp = curr.val;
        curr.val = next.val;
        next.val = temp;
    }
    
    public void inOrder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        
        inOrder(root.left);
        
        /*
        if (prev == null)
        {
            System.out.println("-1");
        } */
        
        if (prev != null && root.val < prev.val)
        {
            if (curr == null)
            {
                curr = prev;
            }
      
            next = root;
        }
        
        prev = root;
        
        // System.out.println(prev.val + " ");
        
        inOrder(root.right);
        
    }
}