// Last updated: 7/14/2026, 2:04:02 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=0;
        for(int i=0;i<m;i++)
        {
            t++;
        }
        for(int i=0;i<n;i++)
        {
            nums1[t]=nums2[i];
            t++;
        }
        Arrays.sort(nums1);
    }
}