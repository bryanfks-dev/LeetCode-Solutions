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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prev_reminder = 0; // This variable carry the reminder number from previous node

        ListNode rev_out = null;

        while (l1 != null || l2 != null || prev_reminder != 0) {
            // Decide digit from linked lists
            int digit_l1 = (l1 != null) ? l1.val : 0,
                digit_l2 = (l2 != null) ? l2.val : 0;

            // Sum digits and previous reminder
            int sum = digit_l1 + digit_l2 + prev_reminder;

            // Update prev_reminder
            prev_reminder = sum / 10;

            // Append new node
            ListNode new_node = new ListNode(sum % 10);

            new_node.next = null;

            if (rev_out == null) {
                rev_out = new_node;
            }
            else {
                ListNode curr_node = rev_out;

                while (curr_node.next != null) {
                    curr_node = curr_node.next;
                }

                curr_node.next = new_node;
            }

            // Update l1 & l2
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return rev_out;
    }
}