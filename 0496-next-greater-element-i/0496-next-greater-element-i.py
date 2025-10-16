class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        next_greater={}
        mystack=[]
        res=[]
        for i in nums2:
            while mystack and i>mystack[-1]:
                ele=mystack.pop()
                next_greater[ele]=i
            mystack.append(i)
        for i in nums1:
            if i in next_greater:
                res.append(next_greater[i])
            else:
                res.append(-1)
        return res

        