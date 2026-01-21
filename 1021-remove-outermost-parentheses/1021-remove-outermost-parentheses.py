class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        vs=""
        count=0
        for i in s:
            if i=="(":
                count+=1
                if count==1:
                    pass
                else:
                    vs+=i
            else:
                count-=1
                if count ==0:
                    pass
                else:
                    vs+=i
        return vs
            
            
        