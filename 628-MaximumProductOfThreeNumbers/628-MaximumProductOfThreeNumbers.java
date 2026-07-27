// Last updated: 7/27/2026, 2:27:05 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       
       int max=Math.max((nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]),(nums[0]*nums[1]*nums[nums.length-1]));
        
     
         
        return max;
        
        

    }
}