// Last updated: 9/6/2026, 4:30:19 PM
class Solution {
    public int[] twoSum(int[] nums, int t) {
        int[] a=new int[2];
        int j=nums.length-1;
        int i=0;
        while(i<j)
        {
            int s=nums[i]+nums[j];
            if(nums[i]+nums[j]==t)
            {
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
           else if(s<t)
            {
                i++;
            }
          else
          {
            j--;
          }
        }
        return a;
    }
}