// Last updated: 8/29/2026, 8:45:29 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }
        for(int i=1;i<101;i++)
        {
                  if(!h.contains(i*k))
                  {
                     return i*k;
                  }
        }
        return 101;
    }
}