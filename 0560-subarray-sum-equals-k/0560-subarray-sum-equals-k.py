class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixsum=0
        match_prefix={0:1}
        result=0
        for i in nums:
            prefixsum+=i
            if prefixsum-k in match_prefix:
                result+=match_prefix[prefixsum-k]
            if prefixsum in match_prefix:
                match_prefix[prefixsum]+=1
            else:
                match_prefix[prefixsum]=1
                
        return result            
                    
                
                
            
        