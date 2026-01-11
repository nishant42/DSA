class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow=0
        fast=0
        count=1
        for i in range(len(nums)):
            if nums[slow] == nums[fast]:
                fast=fast+1
            else:
                slow=slow+1
                nums[slow]=nums[fast]
                fast=fast+1
                count+=1
        return count
        