class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # Initialize memo dictionary
        memo = {}
        return self.funsum(m - 1, n - 1, memo)
    
    def funsum(self, i, j, memo):
        # Base condition: if both i and j are 0, we are at the start cell
        if i == 0 and j == 0:
            return 1
        
        # If the index is out of bounds (negative), return 0
        if i < 0 or j < 0:
            return 0
        
        # Check if result is already calculated
        if (i, j) in memo:
            return memo[(i, j)]
        
        # Recursive calls: calculate paths from the top and left cells
        memo[(i, j)] = self.funsum(i - 1, j, memo) + self.funsum(i, j - 1, memo)
        return memo[(i, j)]
