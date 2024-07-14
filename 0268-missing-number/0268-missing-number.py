class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        t=n
        r=0
        for i in nums:
            r=r+i
            t=t+(n-1)
            n-=1
        return t-r 
        