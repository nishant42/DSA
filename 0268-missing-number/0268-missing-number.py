class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=  len(nums)
        sum=0
        nsum= (n * (n+1))/2
        for i in nums:
            sum+=i
        result=int(nsum-sum)
        return result
        