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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = length(head);
        int n = k % len;
        if(n == 0) return head;
        ListNode nth = nthNode(head,len-n);
        ListNode nextNode = nth.next;
        nth.next = null;
        ListNode last = nextNode;
        while(last.next != null){
            last = last.next;
        }
        last.next = head;
        return nextNode;

    }
    public int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode nthNode(ListNode head, int n){
        int i = 1;
        while(head != null){
            if(n == i) return head;
            head = head.next;
            i++;
        }
        return null;
    }
}