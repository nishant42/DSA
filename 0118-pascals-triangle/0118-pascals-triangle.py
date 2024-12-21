class Solution:
      
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]
        for i in range(1,numRows+1):
            result.append(self.generate_row(i))
        return result    
    def generate_row(self,r):
        r1=1
        row=[]
        row.append(r1)
        res=r1
        for i in range(1,r):
            res=res*(r-i)
            res=res//i
            row.append(res)
        return row  

        