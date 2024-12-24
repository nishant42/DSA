class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        bp=-1
        for i in range(len(nums)-2,-1,-1):
            if nums[i+1]>nums[i]:
                bp=i
                break
        if bp==-1:
            nums[:]=nums[::-1]
            return nums
        for j in range(len(nums) - 1, bp, -1):   
            if nums[j]>nums[bp]:
                nums[j],nums[bp]=nums[bp],nums[j]
                break
        nums[bp+1:] = nums[bp+1:][::-1]        

            
                
        