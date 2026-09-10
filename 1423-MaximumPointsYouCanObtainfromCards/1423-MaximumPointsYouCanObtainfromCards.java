// Last updated: 9/10/2026, 2:53:36 PM
1class Solution 
2{
3    public int maxScore(int[] arr, int k) 
4    {
5          int sum = 0;
6
7     
8        for (int i = 0; i < k; i++) 
9        {
10            sum += arr[i];
11        }
12
13        int maxSum = sum;
14         int l=arr.length-1;
15        for (int i = k-1; i >= 0; i--) {
16
17            sum = sum - arr[i];
18             sum = sum + arr[l];
19             l--;
20
21            maxSum = Math.max(maxSum, sum);
22        }
23
24        return maxSum;
25    }
26    
27}