class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        tracker={}

        for i in range(len(nums)):
            check= target-nums[i]
            if check in tracker:
                return [tracker[check],i]
            else:
                tracker[nums[i]]=i
        