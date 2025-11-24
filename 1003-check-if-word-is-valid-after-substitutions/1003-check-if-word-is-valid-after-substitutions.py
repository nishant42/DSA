class Solution:
    def isValid(self, s: str) -> bool:
        res=[]
        for i in s:
            if i=='c':
                if len(res)>=2 and res[-1]=='b' and res[-2]=='a':
                    res.pop()
                    res.pop()
                else:
                    return False

            else:
                res.append(i)
        if not res:
            return True
        else:
            return False
# Completedf on 24 nov 2025
        