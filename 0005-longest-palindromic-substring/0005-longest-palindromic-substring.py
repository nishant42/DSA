class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) <= 1:
            return s
        
        max_length=1
        max_string=s[0]
        test = [[False for _ in range(len(s))] for _ in range(len(s))]
        for i in range(len(s)):
            test[i][i] = True
            for j in range(i):
                if s[j] == s[i] and (i-j <= 2 or test[j+1][i-1]):
                    test[j][i] = True
                    if i-j+1 > max_length:
                        max_length = i-j+1
                        max_string = s[j:i+1]
        return max_string
        