class Solution:
    def isValid(self, s: str) -> bool:
        bracket={"}":"{",")":"(","]":"["}
        res=[]
        for i in s:
            if i in bracket:
                if not res or bracket[i]!=res[-1]:
                    return False
                res.pop()
            else:
                res.append(i)
        return not res

        