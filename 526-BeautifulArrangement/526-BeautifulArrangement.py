# Last updated: 8/5/2026, 3:01:28 PM
1class Solution:
2    def permute(self, nums: List[int]) -> List[List[int]]:
3
4        def backtrack(start):
5            if start == len(nums):
6                res.append(nums[:])
7                return
8            
9            for i in range(start, len(nums)):
10                nums[start], nums[i] = nums[i], nums[start]
11                backtrack(start + 1)
12                nums[start], nums[i] = nums[i], nums[start]
13
14        res = []
15        backtrack(0)
16        return res