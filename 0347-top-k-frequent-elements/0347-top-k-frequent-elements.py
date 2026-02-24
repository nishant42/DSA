class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mydict={}
        result=[]
        for key in nums:
            mydict[key] = mydict.get(key, 0) + 1
        buckets=[]
        for _ in range(len(nums)+1):
            buckets.append([])
        for key , freq in mydict.items():
            buckets[freq].append(key)
        for i in range(len(buckets) - 1, 0, -1):
            for num in buckets[i]:
                result.append(num)
                if len(result) == k:
                    return result
        
        