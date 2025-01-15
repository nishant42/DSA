class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # stat={}
        # n=len(nums)
        # for i in range(0,len(nums)):
        #     stat[nums[i]] = stat.get(nums[i], 0) + 1
        #     if stat[nums[i]] > n // 2:  # Check for majority
        #         return nums[i]    
        count=0
        element=nums[0]
        for i in range(0,len(nums)):
            curr_element=nums[i]
            if count==0:
                element=curr_element 
            if  curr_element == element :
                count+=1
            else:
                count-=1
            
        return element
               
            



                

            
            
        


        