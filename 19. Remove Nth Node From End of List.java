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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head, curr_node = head;
        
        // Move tail to n + 1 gap from head
        for (int gap = 0; gap < n; gap++) tail = tail.next;
        
        // So, in this case there is always be n + 1 node gap 
        // between tail and selected node
        
        // Base case, if tail already placed in the end of linked list
        if (tail == null) return head.next;
        
        // Move tail into the end of linked list
        while (tail.next != null) {
            tail = tail.next;
            
            // While updating the current node
            curr_node = curr_node.next;
        }
        
        // Link current node with 2 node ahead current node
        curr_node.next = curr_node.next.next;
        
        return head;
    }
}