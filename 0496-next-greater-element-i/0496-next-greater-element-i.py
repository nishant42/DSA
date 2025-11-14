class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result={}
        stack=[]
        for i in range(len(nums2)):
            curr=nums2[i]
            while stack  and curr>nums2[stack[-1]]:
                ele=stack.pop()
                result[nums2[ele]] = curr
            stack.append(i)
        while stack:
            ele_index = stack.pop()
            result[nums2[ele_index]] = -1
            
        return [result[n] for n in nums1]


        