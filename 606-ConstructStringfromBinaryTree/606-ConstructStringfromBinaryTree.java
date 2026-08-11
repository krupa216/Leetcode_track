// Last updated: 8/11/2026, 11:14:24 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public String tree2str(TreeNode root) {
18        if(root == null)
19        {
20            return "";
21        }
22        String res=root.val+"";
23        String l=tree2str(root.left);
24        String r=tree2str(root.right);
25
26        if(l=="" && r=="")
27        {
28            return res;
29                    }
30                    if(l=="")
31                    {
32                    return res + "()" + "(" + r + ")";
33                    }
34        if (r == "") 
35        {return res + "(" + l + ")";
36        }
37        return res + "(" + l + ")" + "(" + r + ")";
38        
39    }
40}