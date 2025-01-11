class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        stat={}
        n=len(nums)
        for i in range(0,len(nums)):
            stat[nums[i]] = stat.get(nums[i], 0) + 1
            if stat[nums[i]] > n // 2:  # Check for majority
                return nums[i]      

                

            
            
        


        