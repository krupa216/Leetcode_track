// Last updated: 9/21/2026, 3:24:43 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> j :h.entrySet())
        {
            if(j.getValue()>nums.length/3)
            {
                l.add(j.getKey());
            }
        }
        return l;
    }
}