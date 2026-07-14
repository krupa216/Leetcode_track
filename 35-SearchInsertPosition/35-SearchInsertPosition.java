// Last updated: 7/14/2026, 2:04:22 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)

            {
                return i;
            }
            else if(nums[i]>=target+1)
            {
                return i;
            }
            
            
        }
       return nums.length; 
    }
   
    
}