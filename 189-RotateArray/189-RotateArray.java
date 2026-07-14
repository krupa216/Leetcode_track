// Last updated: 7/14/2026, 2:03:39 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] t=new int[n];
        for(int i=0;i<n;i++)
        {
            t[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=t[i];
        }

    }
}