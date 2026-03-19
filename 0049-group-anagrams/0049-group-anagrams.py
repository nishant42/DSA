class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1=defaultdict(list)
        
        for stri in strs:
            count= [0]*26
            for s in stri:
                count[ord(s)-ord('a')]+=1
            dict1[tuple(count)].append(stri)
        return list(dict1.values())
