class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
    
        res= {}
        thres=len(nums)//3
        for i in range(len(nums)):
            # no of possible outcomes = k-1 = 3-1=2 res should be of len 2
            #if not then insert element with count
            # if nums[i] in res:
            #     res[nums[i]]+=1

            # if len(res)<2:
            #     res[nums[i]]=res.get(nums[i],0)+1
            if nums[i] in res:
                res[nums[i]] += 1
            elif len(res) < 2:
                res[nums[i]] = 1
            else:
                for key in list(res.keys()):
                    res[key] -= 1
                    if res[key] == 0:
                       del res[key]
        result=[]
        for candidate in res:
            if nums.count(candidate) > thres:
                result.append(candidate)
        
        return result


            

        