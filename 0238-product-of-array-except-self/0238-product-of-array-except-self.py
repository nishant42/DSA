class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        running=1
        leftp=[1]*len(nums)
        rightp=[1]*len(nums)
        for i in range(0,len(nums)):
            leftp[i] = running      # write what's on my left
            running *= nums[i] 
        running=1
        for i in range(len(nums) - 1, -1, -1):
            rightp[i]=running
            running*= nums[i]
        return [a * b for a, b in zip(leftp, rightp)]
        


        