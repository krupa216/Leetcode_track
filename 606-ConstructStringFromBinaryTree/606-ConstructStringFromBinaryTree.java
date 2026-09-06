// Last updated: 9/6/2026, 4:28:10 PM
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
    public String tree2str(TreeNode root) {
        if(root == null)
        {
            return "";
        }
        String res=root.val+"";
        String l=tree2str(root.left);
        String r=tree2str(root.right);

        if(l=="" && r=="")
        {
            return res;
                    }
                    if(l=="")
                    {
                    return res + "()" + "(" + r + ")";
                    }
        if (r == "") 
        {return res + "(" + l + ")";
        }
        return res + "(" + l + ")" + "(" + r + ")";
        
    }
}