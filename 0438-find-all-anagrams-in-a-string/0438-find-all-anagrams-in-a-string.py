class Solution:
    def findAnagrams(self, s: str, p: str) -> list[int]:
        # 1. k is the length of p (the window size)
        k=len(p)
        # 2. make 26 empty boxes for p's letter counts
        need= [0]*26
        # 3. make 26 empty boxes for the window's letter counts
        window= [0] * 26
        # 4. go through each letter of p:
        # 5.     put one in that letter's box in p's boxes
        for c in p:
            need[ord(c)-ord('a')]+=1

        # 6. make an empty list for the answers
        ans=[]
        # 7. go through s, getting each position and its letter:
        for ind,ch in enumerate(s):
        # 8.     put one in this letter's box in the window's boxes
            window[ord(ch)-ord('a')]+=1
        # 9.     if the window has gone past size k:
            if ind >=k:
                window[ord(s[ind-k])-ord('a')]-=1
        # 10.        take one out of the box for the letter k steps behind me
        # 11.    if the window's boxes match p's boxes:
            if window==need:
                ans.append(ind-k+1)
        return ans
        # 12.        save where this window starts (my position - k + 1)
        # 13. return the list of answers
                