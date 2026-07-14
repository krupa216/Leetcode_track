// Last updated: 7/14/2026, 2:03:18 PM
class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]!=0)
                    {
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        i++;
                        
                    }
                }
            
        
    }
}