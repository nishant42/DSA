/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null ){
              return true;
        }
    
    ListNode slow=head,fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
ListNode secondhalf=reverseList(slow);
ListNode firsthalf=head;
ListNode temp=secondhalf;
while(temp!=null){
    if (temp.val!=firsthalf.val){
        return false;
    }
    firsthalf=firsthalf.next;
    temp=temp.next;
}
return true;
    }


    public ListNode reverseList(ListNode head){
        ListNode prev= null;
        while(head!=null){
            ListNode nextnode=head.next;
            head.next=prev;
            prev=head;
            head=nextnode;
        }
        return prev;

    }
}