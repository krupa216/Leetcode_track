// Last updated: 7/14/2026, 2:01:33 PM
class Solution {
    public int minElement(int[] nums) {
        int t=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
       int s=0;
         while(nums[i]>0)
        {
            int r=nums[i]%10;
            s+=r;
            nums[i]/=10;
        }
           t=Math.min(t,s);
        }
       
        
       
        return t;
    }
}