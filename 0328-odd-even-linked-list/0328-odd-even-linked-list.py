# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def oddEvenList(self, head):
        if not head:
            return None
        oddlocator=head
        evenlocator=head.next
        temp=evenlocator
        while evenlocator and evenlocator.next :
            oddlocator.next=oddlocator.next.next
            evenlocator.next=evenlocator.next.next
            oddlocator=oddlocator.next
            evenlocator=evenlocator.next
        oddlocator.next=temp 
        return head   
        
        
        
        