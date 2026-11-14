from collections import Counter
class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        count= Counter(nums)
        # res=[num for num,count in count.most_common(k)]
        # return res
        res= sorted(count.items(),key=lambda x: -x[1])
        return [x for x,y in res[:k]]

        