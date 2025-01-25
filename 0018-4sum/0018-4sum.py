class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        result=[]
        # for i in range(len(nums)-3): because if you have to find 4 quadraterals
        #you need 3 elements left from nums if you fix first element
        #same goes for 3sum you need 2 elements left from num if you fix second.
        for i in range(len(nums)-3):
            if nums[i]==nums[i-1] and i>0:
                continue
            # checking duplicacy , we need unique combination
            for j in range(i+1,len(nums)-2):
                if nums[j]==nums[j-1] and j > i+1:
                    continue
                # finding remaining 2 elements after first and second fix
                #so we are doing 2sum using 2 pointer algorithm.
                right=len(nums)-1
                left=j+1
                while left<right:
                    tar= nums[i]+nums[j]+nums[left]+nums[right]
                    if tar==target:
                        result.append([nums[i],nums[j],nums[left],nums[right]])
                        left+=1
                        right-=1
                        while left<right and nums[left]==nums[left-1]:
                            left+=1
                        while left<right and nums[right]==nums[right+1]:
                            right-=1
                    elif tar>target:
                        right-=1
                    else:
                        left+=1
        return result

