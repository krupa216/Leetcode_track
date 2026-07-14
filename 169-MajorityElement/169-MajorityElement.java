// Last updated: 7/14/2026, 2:03:42 PM
class Solution {
    public int majorityElement(int[] nums) {
       int c=0;
       int tar=0;
      


       for(int i=0;i<nums.length;i++)
       {
        
            if(c==0)
            {
                tar=nums[i];
            }
            if(nums[i]==tar)
            {
                c++;
            }
            else{
                c--;
            }

        }
       
       return tar;
    }
}