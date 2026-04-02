class Solution:
    def evalRPN(self, tokens):
        mystack = []
        for i in tokens:
            if i not in "+-*/":
                mystack.append(i)
            else:
                x = int(mystack.pop())
                y = int(mystack.pop())
                if i=="+":
                    result = y + x
                elif i=="-":
                    result = y - x
                elif i=="*":
                    result = y * x
                elif i=="/":
                    result = int(y / x)  
                mystack.append(str(result))
        return int(mystack[0])

            




        