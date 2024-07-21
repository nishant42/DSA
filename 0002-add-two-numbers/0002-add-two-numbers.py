# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        temp1=l1
        sum1=""
        while temp1 is not None:
            sum1+=str(temp1.val)
            temp1=temp1.next
        temp2=l2
        sum2=""
        while temp2 is not None:
            sum2+=str(temp2.val)
            temp2=temp2.next
        sum1=sum1[::-1] 
        sum2=sum2[::-1]
        finalsum=int(sum1)+int(sum2)
        finalsum=str(finalsum)
        finalsum=finalsum[::-1]
        head=ListNode(0,None)
        t=head
        for i in finalsum:
            
            t.next=ListNode(i,None)
            t=t.next
            
        return head.next    
           
        
     
        