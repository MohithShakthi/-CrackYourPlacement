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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        ListNode node = head.next;
        while(node != null){
            if(node.val > current.val){
                current.next = node;
                current = node;
            }
            node = node.next;
        }
        current.next=null;
        return head;
    }
}