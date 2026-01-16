class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        tester=strs[0]
        
        for i in range(1,len(strs)):
            j=0
            while j<len(tester) and j<len(strs[i]) and tester[j]==strs[i][j]:
                j+=1
            tester=tester[:j]
        if not tester:
            return ""

        return tester
                
            

        