class Solution:
    def firstUniqChar(self, s: str) -> int:
        mydict={}
      
        for i in s:
            mydict[i]=mydict.get(i,0)+1
        for key,val in mydict.items():
            
            if val==1:
                return s.index(key)
            else:
                pass
            
        return -1    
        