// Last updated: 9/6/2026, 4:26:59 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> a=new ArrayList<>();
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            val=(val*2+nums[i])%5;
            
            a.add(val==0);
        }
        return a;
    }
}