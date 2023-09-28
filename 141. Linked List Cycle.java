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
    public boolean hasCycle(ListNode head) {
        // Base case
        if (head == null || head.next == null)
            return false;
        
        ListNode curr_node = head;
        ListNode next_node = head;

        // Make sure next node of next_node is not null, otherwise a cycle wont do
        while (next_node != null && next_node.next != null) {
            curr_node = curr_node.next;
            next_node = next_node.next.next;

            // Check cycle node
            if (curr_node == next_node)
                return true;
        }

        return false;
    }
}