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
    public int minDepth(TreeNode root) 
    {
        if (root == null)
        {
            return 0;
        }
        
        return bfs(root);
    }
    

    public int bfs(TreeNode root)
    {     
        int length = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while (!q.isEmpty())
        {
            length++;
            int level = q.size();
            
            for (int i = 0; i < level; i++)
            {
                TreeNode curr = q.poll();
            
                if (curr.left == null && curr.right == null) 
                {
                    return length;
                }
            
                if (curr.left != null)
                {
                 q.add(curr.left);
                }
            
                if (curr.right != null)
                {
                    q.add(curr.right);
                }     
            }
        }
        
        return length;
    } 
}