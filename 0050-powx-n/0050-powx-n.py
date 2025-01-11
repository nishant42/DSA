class Solution:
    def myPow(self, x: float, n: int) -> float:
        
        if n<0:
            x= 1.0/x
            n=-n
        if n==0:
            return 1.0
        curr=x
        prod=1.0
        while (n>0):
            
            if n%2 == 1:
                prod*=curr
            
            curr*=curr
            n//=2
        return prod
