/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Base case
        if (headA == null || headB == null)
            return null;
        
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            // Explenation:
            // Without knowing the length of each linked list,
            // we can move each pointer in a linked list
            // perhaps, there is a difference length
            // but it's not a big deal, because, everytime
            // one of pointer is finished moving, it's going to
            // change the position to the other linked list,
            // and (assume the length of headA and headB are not same)
            // everytime it's change linked list, the gap between these 2
            // pointers going to be +1 node, so eventually,
            // they will meet in a same node
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}