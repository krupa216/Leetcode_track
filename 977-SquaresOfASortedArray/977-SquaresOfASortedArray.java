// Last updated: 9/6/2026, 4:27:07 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}