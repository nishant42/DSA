class Solution:
    def reversePairs(self, nums: List[int]) -> int:
        high=len(nums)
        return self.sortt(nums,0,high-1)
    def sortt(self,nums,low,high):
        if low>=high:
            return 0
        mid=(low+high)//2
        count=self.sortt(nums,low,mid) + self.sortt(nums,mid+1,high)
        count+=self.reverse_pair(nums,low,mid,high)
        self.merge(nums,low,mid,high)
        return count
    def merge(self,nums,low,mid,high):
        temp=[]
        left=low
        right=mid+1
        while(left<=mid and right<=high):
            if nums[left]<=nums[right]:
                temp.append(nums[left])
                left+=1
            else:
                temp.append(nums[right])
                right+=1
        while(left<=mid ):
            temp.append(nums[left])
            left+=1 
        while(right<=high ):
            temp.append(nums[right])
            right+=1   
        for i in range(low,high+1):
            nums[i]=temp[i-low]
    def reverse_pair(self,nums,low,mid,high):
        count=0
        right=mid+1
        for i in range(low,mid+1):
            while(right<=high and nums[i]>2*nums[right]):
                right+=1
            count+=right-(mid+1)
        return count