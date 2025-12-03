class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        output=[0]*len(temperatures)
        stack=[]
        n=len(temperatures)
        for i in range(n):
            while stack and temperatures[i]>temperatures[stack[-1]]:
                res=stack.pop()
                output[res]=i-res
            stack.append(i)

        return output
        