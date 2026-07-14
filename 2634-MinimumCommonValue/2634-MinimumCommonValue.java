// Last updated: 7/14/2026, 2:01:51 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      HashSet<Integer> h=new HashSet<>();
      for(int i:nums1)
      {
        h.add(i);
      }
      for(int j:nums2)
      {
        if(h.contains(j))
        {
            return j;
        }
      }
      return -1;
    }
}