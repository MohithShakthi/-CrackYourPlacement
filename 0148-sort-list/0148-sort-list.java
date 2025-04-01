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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);

        return mergList(left,right);
    }
    public ListNode getMid(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergList(ListNode list1,ListNode list2){
        ListNode head = new ListNode();
        ListNode current = head;
        while(list1 != null && list2 != null){
            current.next = new ListNode();
            current = current.next;
            if(list1.val > list2.val){
                current.val = list2.val;
                list2 = list2.next;
            }
            else{
                current.val = list1.val;
                list1 = list1.next;
            }
        }
        while(list1 != null){
            current.next = new ListNode();
            current = current.next;
            current.val = list1.val;
            list1 = list1.next;
        }
        while(list2 != null){
            current.next = new ListNode();
            current = current.next;
            current.val = list2.val;
            list2 = list2.next;
        }
        return head.next;
    }
}