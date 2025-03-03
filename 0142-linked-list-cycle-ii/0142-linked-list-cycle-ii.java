/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head ==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
       
    }
}



// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if (head == null || head.next == null) {
//             return null;
//         }

//         ListNode slow = head;
//         ListNode fast = head;

//         // Step 1: Detect the cycle using slow and fast pointers
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) { // Cycle detected
//                 slow = head; // Move slow back to head
                
//                 // Step 2: Find the cycle start
//                 while (slow != fast) {
//                     slow = slow.next;
//                     fast = fast.next;
//                 }
//                 return slow; // Corrected return statement
//             }
//         }
        
//         return null; // No cycle found
//     }
// }
