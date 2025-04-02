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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode prevEnd = node;
        while(head != null){
            ListNode kth = kthNode(head,k);
            if(kth == null){
                prevEnd.next = head;
                break;
            }
            ListNode nextStart = kth.next;
            kth.next = null;
            prevEnd.next = reverse(head);
            prevEnd = head;
            head = nextStart;
        }
        return node.next;
    }
    public ListNode kthNode(ListNode node,int k){
        int c = 1;
        while(node != null){
            if(c == k) return node;
            node = node.next;
            c++;
        }
        return null;
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