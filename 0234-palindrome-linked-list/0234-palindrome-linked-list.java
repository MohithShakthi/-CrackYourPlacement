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
        ListNode newHead = head;
        ListNode mid = getMid(head);
        ListNode rev = reverse(mid.next);
        while(rev != null){
            if(newHead.val != rev.val) return false;
            newHead = newHead.next;
            rev = rev.next;
        }
        return true;
    }
    public ListNode getMid(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode node){
        ListNode current = node;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}