class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        '''    
        1. Sort the list of interval using start time of interval using lambda
        2.initiate mmerged list
        3.add first interva to compare or if end time < start time of current
        interval it means it is non overlapping merge the current interval
        3.if over lapping like first add 1,3 and when we take 2,6 it is overlapping
        then we simply change the end time with the max end time of curr and last 
        interval in merged list.
        '''
        if not intervals:
            return []
        intervals.sort(key=lambda x:x[0])    
        merged=[]
        for interval in intervals:
            if not merged or merged[-1][1]<interval[0]:
                merged.append(interval)
            else:
                merged[-1][1]=max(merged[-1][1],interval[1])
        return merged            
        