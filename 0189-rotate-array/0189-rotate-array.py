class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        k= k % n
        def reverse(st,en):
            while(st<en):
                nums[st],nums[en]=nums[en],nums[st]
                st=st+1
                en=en-1
        reverse(0,n-1)
        reverse(0,k-1)
        reverse(k,n-1)

        