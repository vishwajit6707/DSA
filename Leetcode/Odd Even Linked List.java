// Odd Even Linked List.
// Leetcode Link - https://leetcode.com/problems/odd-even-linked-list/

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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        ListNode odd = head;
        while(even != null && even.next != null){
            if(even.next != null){
                odd.next = odd.next.next;
                odd = odd.next;
            }
            if(even.next != null){
                even.next = even.next.next;
                even = even.next;
            }
        }
        odd.next = evenHead;
        return head;
    }
}
