class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        0 -> low-1 = 0, low - > medium-1 = 1 , medium -> high =. unordered , high+1 ->
        n-1 = 2
        [0,0,1,1,0,2,1,2]
        """
        loww= 0
        mid= 0
        high=len(nums)-1
        while mid<=high:
            if nums[mid] == 0 :
                #swap mid with low as low is the first element after 0
                # increment low and mid as new low , mid
                nums[mid],nums[loww]=nums[loww],nums[mid]
                loww+=1
                mid+=1
            elif nums[mid]==1:
                # mid is just after mid-1 which is also 1 so we just need to 
                #increment mid 
                mid+=1
            else:
                #swap mid with high to get shorted 2 and then decrement high -1
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
                
                
                
                
        
        
        