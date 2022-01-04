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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        
        if (root == null)
        {
            return res;
        }
        
        stk.push(root);
        
        while (!stk.isEmpty())
        {
            TreeNode node = stk.pop();   
            res.add(node.val);
            
            if (node.right != null)
            {
               stk.push(node.right);
            }
            
            if (node.left != null)
            {
                stk.push(node.left);
            }    
        }
        
        return res;
    }
}