class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum= float('-inf')
        currsum=0
        for num in nums:
            currsum=max(num,currsum+num)
            maxsum=max(currsum,maxsum)
        return maxsum
        