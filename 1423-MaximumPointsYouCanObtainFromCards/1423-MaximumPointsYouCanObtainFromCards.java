// Last updated: 9/21/2026, 3:22:14 PM
class Solution 
{
    public int maxScore(int[] arr, int k) 
    {
          int sum = 0;

     
        for (int i = 0; i < k; i++) 
        {
            sum += arr[i];
        }

        int maxSum = sum;
         int l=arr.length-1;
        for (int i = k-1; i >= 0; i--) {

            sum = sum - arr[i];
             sum = sum + arr[l];
             l--;

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    
}