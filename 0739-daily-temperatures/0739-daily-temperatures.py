class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
            n = len(temperatures)
            res = [0] * n
            stack = []  # Stores indices
            
            for i in range(n):
                # If current element is greater than top, we found the 'next greater'
                while stack and temperatures[i] > temperatures[stack[-1]]:
                    index = stack.pop()
                    res[index] = i-index
                stack.append(i)
                
            return res
        