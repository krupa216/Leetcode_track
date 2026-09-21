// Last updated: 9/21/2026, 3:22:41 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=0;
        int s=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            while(z>k)
            {
                if(nums[s]==0)
                {
                    z--;
                  
                }
                  s++;
            }
           max=Math.max(max,i-s+1);
        }
        return max;
    }
}