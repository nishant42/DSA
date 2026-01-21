class Solution:
    def largestOddNumber(self, num: str) -> str:
       
        for i in range(len(num)-1, -1, -1):
            part = num[:i]
            if num[i] in "13579":
                return num[:i+1]
        return ""



        