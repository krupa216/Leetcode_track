// Last updated: 7/14/2026, 2:04:46 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] n=new int[nums1.length+nums2.length];
        int t=0;
           int st=0;
        for(int i=0;i<nums1.length;i++)
        {
            n[i]=nums1[i];
            t++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            n[t]=nums2[i];
            t++;
        }
        Arrays.sort(n);
        if(n.length%2 !=0)
        {
         return n[n.length/2];
        }
        
        

           int mid=n.length/2;
           st=n[mid]+n[mid-1];
        System.out.print(n[mid]);
        return st/2.0;
    }
}