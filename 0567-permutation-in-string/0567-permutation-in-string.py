class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        k= len(s1)
        need= [0]*26
        window= [0]*26
        for i in s1:
            need[ord(i)-ord('a')]+=1
        for ind,ch in enumerate(s2):
            window[ord(ch)-ord('a')]+=1
            print("ind : ",ind,"k :",k)
            print("window",window)
            if ind>=k:
                print("worked")
                window[ord(s2[ind-k])-ord('a')]-=1
            if window==need:
                return True
        return False

'''
len of s1
one need list which contains char frrequency on its integer initialize with 0 for 26
second one is to tract the window char frequency
do a for loop for the window
let it fill the pos
check if the window is not exceede 
if exceeded then decrease freq of the leftmost char which is index-k 
check if window and need macth if match return true

if nothing happend return false after for loop

'''
        