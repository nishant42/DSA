# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteNode(self, node):
        self.temp=node
        self.temp.val=self.temp.next.val
        self.temp.next= self.temp.next.next
       

        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        