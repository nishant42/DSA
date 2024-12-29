class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        For brute force [0][0] becomes [0][3] and [0][1] become [1][3] -> conclude
        left side j become right side i and right side j= (n-1)-i for n=4 i=0 ->3   
        thus you get [0][0]->[0][3]

        Approach (Oprimize): First transpose the matrix meaning making columns the row 
        of the matrix ex.row 0-> 1 2 3 become column 0 -> 1 2 3 . if this goes
        on the you will eventually find row 0 -> 1 4 7 and if you then reverse
        it you will find row 0 -> 7 4 1 . like wise you will find the resultant 
        marix to be 90 degree rotated. 
        transpose -> Step 1. you can see the diagonals remains same 
        even after transpose of matrix that is 1 5 9 and and everything right
        to the diagonal element is just swapeed to became transpose matix.
        1 2 3    1 4 7                  7 4 1
        4 5 6 -> 2 5 8 (Transpose) ->   8 5 2  (Reverse)
        7 8 9    3 6 9                  9 6 3
        """
        for i in range(0,len(matrix)-1):
            for j in range(i+1,len(matrix)):
                matrix[i][j],matrix[j][i]= matrix[j][i],matrix[i][j]
               
        for i in range(len(matrix)):
            matrix[i]=matrix[i][::-1]    
        