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
    public int countNodes(ListNode head)
    {
        int count=0;
        ListNode temp = head;
        while(temp!=null)
        {
            count=count+1;
            temp= temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=countNodes(head);
        n = count-n;
        if(n==0)
        {
            if(count<=1) return null;
            else return head.next;

        }
        else{
            ListNode temp = head;
            ListNode del=temp;
            for(int i=0;i<n-1;i++)
            {
                temp = temp.next;
            }
            del = temp.next;
            temp.next = del.next;
            del.next = null;
        }
        return head;
    }
}
