// Last updated: 9/6/2026, 4:24:14 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0;
        int arr[]=new int[2];
        
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                c++;
                break;
                }
            }
        }
        arr[0]=c;
        c=0;
        for(int i=0;i<nums2.length;i++)
        {
           for(int j=0;j<nums1.length;j++)
           {
            if(nums1[j]==nums2[i])
            {
                c++;
                break;
            }
           }
        }
        arr[1]=c;
        return arr;
    }
}