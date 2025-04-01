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
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(head.next != null && head.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return helper(head,slow);
            }
        }
        return null;
    }
    public ListNode helper(ListNode first, ListNode second){
        while(true){
            if(first == second) return first;
            first = first.next;
            second = second.next;
        }
    }
}