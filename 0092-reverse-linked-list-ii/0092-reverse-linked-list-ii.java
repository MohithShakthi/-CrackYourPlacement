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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head.next == null) return head;
        ListNode before = (left - 1 > 0) ? getNode(head,left-1) : null;
        ListNode start = (before != null) ? before.next : head;
        ListNode end = getNode(head, right);
        ListNode after = (end.next != null) ? end.next : null;
        if(before != null) before.next = null;
        end.next = null;
        start = reverse(start);
        end = getEnd(start);
        if(before != null) before.next = start;
        if(after != null) end.next = after;
        if(left == 1) head = start;
        return head; 
    }
    public ListNode getNode(ListNode node, int pos){
        int count = 1;
        while(node != null){
            if(count == pos) return node;
            node = node.next;
            count++;
        } 
        return null;
    }
    public ListNode getEnd(ListNode node){
        while(node.next != null){
            node = node.next;
        }
        return node;
    }
    public ListNode reverse(ListNode node){
        ListNode current = node;
        ListNode next = null;
        ListNode prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}