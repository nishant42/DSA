from collections import Counter
class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        count= Counter(nums)
        res=[num for num,count in count.most_common(k)]
        return res

        