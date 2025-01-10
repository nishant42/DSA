class Solution:
    def search(self, nums: List[int], target: int) -> int:
        x=self.binary_search(nums,0,len(nums)-1,target)
        return x

    def binary_search(self,nums,low,high,target):
        mid= (low+high)//2
        if low>high:
            return -1
        if target == nums[mid]:
            return mid
        elif target < nums[mid]:
            return self.binary_search(nums,low,mid-1,target)
        else:
            return self.binary_search(nums,mid+1,high,target) 
       



        

        