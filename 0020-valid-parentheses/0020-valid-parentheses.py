class Solution:
    def isValid(self, s: str) -> bool:
        x={"}":"{",")":"(","]":"["}
        stack=[]
        for i in s:  
            if i in "{([":
                stack.append(i)
            else:
                if not stack or stack[-1]!=x[i]:
                    return False
                stack.pop()
        return len(stack)==0
                

        