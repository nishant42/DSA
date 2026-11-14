class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mp={}
        mp2={}
        if len(s) != len(t):
            return False
        for i in s:
            mp[i]=mp.get(i,0)+1
        for j in t:
            mp2[j]=mp2.get(j,0)+1
        
        return mp==mp2
    
        


        