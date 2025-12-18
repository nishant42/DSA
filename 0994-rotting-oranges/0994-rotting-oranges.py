class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        rows=len(grid)
        cols=len(grid[0])
        my_queue=[]
        fresh_count=0
        minutes=0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c]==2:
                    my_queue.append((r,c))
                elif grid[r][c]==1:
                    fresh_count+=1
        if fresh_count==0:
            return 0
        directions=[(0,1),(0,-1),(1,0),(-1,0)]
        while my_queue and fresh_count>0:
            minutes+=1
            orange_to_process=len(my_queue)
            for i in range(orange_to_process):
                (curr_r,curr_c)=my_queue.pop(0)
                for (dr,dc) in directions:
                    neighbour_r=curr_r+dr
                    neighbour_c=curr_c+dc
                    if 0 <= neighbour_r < rows and 0 <= neighbour_c < cols:
                        if grid[neighbour_r][neighbour_c]==1:
                            grid[neighbour_r][neighbour_c]=2
                            fresh_count-=1
                            my_queue.append((neighbour_r,neighbour_c))
        if fresh_count==0:
            return minutes
        else:
            return -1

        