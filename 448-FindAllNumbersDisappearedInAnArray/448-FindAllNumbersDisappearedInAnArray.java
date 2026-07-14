// Last updated: 7/14/2026, 2:02:55 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int[] freq=new int[100001];

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }

        for(int i=1;i<=nums.length;i++)
        {
            if(freq[i]==0)
            {
             l1.add(i);
            }
        }
        return l1;
    }
}