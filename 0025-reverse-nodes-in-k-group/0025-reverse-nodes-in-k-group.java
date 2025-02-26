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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head, prev=null, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;    
    }
        public ListNode kthnode(ListNode temp,int k) {
            k=k-1;
            while(temp!=null && k>0){
                k--;
                temp=temp.next;
            }
            return temp;

 
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev =null;
        ListNode next1=null;
        ListNode kth=null;
        while(temp!=null){

            kth=kthnode(temp,k);
            if (kth==null){
                if (prev!=null){
                        prev.next=temp;
                }
                break;
            }
            next1=kth.next;
            kth.next=null;
            reverseList(temp);

            if(temp==head){
                head=kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=next1;

            
        }

       
        return head;  
    }
}