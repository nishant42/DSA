class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        visited={}
        for i in range(len(nums)):    

            if nums[i] not in visited:
                visited[nums[i]]=1
            else:
                visited[nums[i]]+=1
            if visited[nums[i]]>1:
                return nums[i]   
        