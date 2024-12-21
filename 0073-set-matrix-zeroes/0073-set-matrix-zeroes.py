class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return 9anything, modify matrix in-place instead.
        """
        col0=1
        lenrow=len(matrix)
        lencol=len(matrix[0])
        for i in range(lenrow):
            for j in range(lencol):
                if matrix[i][j]==0:
                    matrix[i][0]=0
                    if j!=0:
                        matrix[0][j]=0
               
                    else:
                        col0=0
        
        for i in range(1,lenrow):
            for j in range(1,lencol):
                if matrix[i][j]!=0:
                    if matrix[i][0]==0 or matrix[0][j]==0:
                        matrix[i][j]=0
        if matrix[0][0]==0:
            for i in range (lencol):
                matrix[0][i]=0
                
        if col0==0:
            for i in range (lenrow):
                matrix[i][0]=0
            