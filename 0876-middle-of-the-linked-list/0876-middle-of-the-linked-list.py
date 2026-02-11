# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        self.temp=head
        count=0
        while self.temp:
            count+=1
            self.temp=self.temp.next
        # print(count)
        x= ( count // 2) + 1
        self.res=head
        while x>1:
            self.res=self.res.next
            x-=1
            
        return self.res