// Last updated: 7/14/2026, 2:03:14 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int i=0;
        int[] a=new int[nums.length];

        for(int j:nums)
        {
            int t=Arrays.binarySearch(a,0,i,j);
            if(t<0)
            {
                t=-(t+1);
            }
            a[t]=j;
            if(t==i)
            {
                i++;
            }
        }
        return i;
    }
}