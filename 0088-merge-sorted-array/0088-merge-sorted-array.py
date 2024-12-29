class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        i starts at the last valid element in nums1 (m - 1).
        j starts at the last element of nums2 (n - 1).
        k starts at the end of nums1 (m + n - 1).
        whichever is greater from nums1 end and nums2 end would be at nums[k]
        and at last remaining nums2 element are checked.
        """
        i=m-1
        j=n-1
        k=m+n-1
        while i>=0 and j>=0:
            if nums1[i]>nums2[j]:
                nums1[k]=nums1[i]
                i-=1
            else:
                nums1[k]=nums2[j]
                j-=1
            k-=1

        while j>=0:
            nums1[k]=nums2[j]
            k-=1
            j-=1