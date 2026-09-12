// Last updated: 9/12/2026, 2:56:42 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3       HashSet<Integer> l=new HashSet<>();
4        for(int i=0;i<nums1.length;i++)
5        {
6            for(int j=0;j<nums2.length;j++)
7            {
8                if(nums1[i]==nums2[j])
9                {
10                    l.add(nums1[i]);
11                }
12            }
13        }
14        int[] f=new int[l.size()];
15       int p=0;
16       for(int k:l)
17       {
18        f[p]=k;
19        p++;
20       }
21       return f;
22    }
23}