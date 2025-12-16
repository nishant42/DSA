class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        res=[]
        
        for curr in asteroids:
            survived = True
            while res and res[-1]>0 and curr<0:
                if abs(res[-1])<abs(curr):
                    res.pop()
                elif abs(res[-1])==abs(curr):
                    res.pop()
                    survived=False
                    break
                else:
                    survived=False
                    break
            if survived:
                res.append(curr)
        return res
        