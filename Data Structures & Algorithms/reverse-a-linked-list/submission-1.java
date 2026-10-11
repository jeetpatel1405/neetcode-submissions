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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        ListNode curr = temp;
        if(head==null) return null;
        while(temp.next!=null)
        {
            temp = temp.next;
            curr.next = prev;
            prev= curr;
            curr = temp;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
