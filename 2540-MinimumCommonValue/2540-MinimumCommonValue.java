// Last updated: 9/6/2026, 4:24:34 PM
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