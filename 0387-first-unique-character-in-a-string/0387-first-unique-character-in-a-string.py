from collections import Counter
class Solution:
    def firstUniqChar(self, s: str) -> int:
        counter= Counter(s)

        for i,j in enumerate(s):
            if counter[j]==1:
                return i
        return -1
  


        