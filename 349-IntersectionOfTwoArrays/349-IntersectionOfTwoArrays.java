// Last updated: 9/21/2026, 3:24:11 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    l.add(nums1[i]);
                }
            }
        }
        int[] f=new int[l.size()];
       int p=0;
       for(int k:l)
       {
        f[p]=k;
        p++;
       }
       return f;
    }
}