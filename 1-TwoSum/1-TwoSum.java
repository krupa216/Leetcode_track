// Last updated: 7/14/2026, 2:04:49 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> n=new HashMap<>();
         int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
           
            int c=target-nums[i];
            if(n.containsKey(c))
            {
                
                ans[0]=n.get(c);
                ans[1]=i;
                return ans;
            }
              n.put(nums[i],i);
        }
        return ans;
    }
}
