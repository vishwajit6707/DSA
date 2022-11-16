// Next Greater Node In Linked List.
// Leetcode Link - https://leetcode.com/problems/next-greater-node-in-linked-list/

// Time Complexity - O(N).
// Space Complexity - O(N).

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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al  = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        while(head != null){
            al.add(head.val);
            head = head.next;
        }
        int [] ans = new int[al.size()];
        for(int i = al.size()-1; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() <= al.get(i)){
                    st.pop();
            }
            if(!st.isEmpty()) ans[i] = st.peek();
            st.push(al.get(i));
        }
        return ans;
    }
}
