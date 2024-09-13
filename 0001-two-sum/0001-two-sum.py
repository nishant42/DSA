class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mydict={}
        for count,val in enumerate(nums):
            check=target-val
            if check in mydict:
                return [mydict[check],count]
            else:
                mydict[val]=count
        return     
        