// Last updated: 7/14/2026, 2:04:31 PM
class Solution {
    public int removeDuplicates(int[] nums) {
      int n=nums.length;
      int i=0;

        for(int j=i+1;j<n;j++)
        {
        if(nums[i]!=nums[j])
           {
            i++;
             nums[i]=nums[j]; 
            
           }
        }
         return i+1;

     
    }
}