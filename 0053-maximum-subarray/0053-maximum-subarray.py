class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        summ=0
        maxim=float('-inf')
        for i in range(len(nums)):
            summ+=nums[i]
            maxim=max(summ,maxim)
            if summ < 0 :
                summ=0
            
                
        return maxim       
        