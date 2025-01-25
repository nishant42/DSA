class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        myset=set(nums)
        longse=0
        for num in myset:
            if num-1 not in myset:
                curr=num
                currlen=1
                while (curr+1 in myset):
                    currlen+=1
                    curr+=1
                longse=max(longse,currlen)
        return longse
       




