// Last updated: 7/14/2026, 2:03:58 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        help(root,l1);
        return l1;
    }
    public void help(TreeNode node,List<Integer> l1)
    {
        if(node ==null)
        return;
        
            help(node.left,l1);
            l1.add(node.val);
            help(node.right,l1);
    }
     
    }
