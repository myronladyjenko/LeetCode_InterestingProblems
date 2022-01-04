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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> res = new LinkedList<>();
	    if(root == null)
        {
           return res; 
        }
		
	    Stack<TreeNode> stk = new Stack<>();
	    TreeNode curr = root;
	
	    while(!stk.isEmpty() || curr != null)
        {
		   if(curr != null)
           {
			  stk.push(curr);
			  res.add(0, curr.val);
			  curr = curr.right;
		   }
            else
            {
			   TreeNode node = stk.pop();
			   curr = node.left;
		    }
	     }
        
	     return res;
    }
}