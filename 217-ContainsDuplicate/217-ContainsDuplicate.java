// Last updated: 7/14/2026, 2:03:30 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
          if(h.contains(nums[i]))
          {
                
              return true;
            }
            else{
                h.add(nums[i]);
            }
         
        }
        return false;
    }
}