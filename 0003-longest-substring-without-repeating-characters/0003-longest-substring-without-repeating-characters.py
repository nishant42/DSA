class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start=0
        end=0

        maxcount=0
        visited = [False] * 256
        while end<len(s):
        
            if visited[ord(s[end])]:
                while visited[ord(s[end])]:
                    visited[ord(s[start])] = False
                    start+=1     
            
            visited[ord(s[end])] = True
            maxcount=max(maxcount,end-start+1)        
            end+=1                 
        return maxcount    

                
                
        