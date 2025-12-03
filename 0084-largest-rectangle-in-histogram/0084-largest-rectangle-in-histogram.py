class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        max_area = 0
        stack = [-1] 
        n = len(heights)

        for i in range(n + 1):
            current_height = heights[i] if i < n else 0

            while stack[-1] != -1 and heights[stack[-1]] >= current_height:
                h = heights[stack.pop()]
                
                L_i = stack[-1]
                R_i = i
                
                width = R_i - L_i - 1
                
                max_area = max(max_area, h * width)
            
            stack.append(i)

        return max_area
        