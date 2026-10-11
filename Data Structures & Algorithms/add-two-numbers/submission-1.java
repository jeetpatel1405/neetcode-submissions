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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1.next!=null && temp2.next!=null)
        {
            temp1.val = temp1.val+temp2.val+carry;
            carry = temp1.val/10;
            temp1.val = temp1.val%10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.val = temp1.val+temp2.val+carry;
        carry = temp1.val/10;
        temp1.val = temp1.val%10;
        // System.out.println(temp1.val);
        // System.out.println(temp2.val);
        if(temp2.next!=null)
        {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            while(temp1.next!=null)
            {
                temp1.val = temp1.val+carry;
                carry = temp1.val/10;
                temp1.val = temp1.val%10;
                temp1 = temp1.next;
            }
            temp1.val = temp1.val+carry;
            carry = temp1.val/10;
            temp1.val%=10;
        }
        else if(temp1.next!=null)
        {
            temp1 = temp1.next;
            // System.out.println(carry);
            
            while(temp1.next!=null)
            {
                temp1.val = temp1.val+carry;
                carry = temp1.val/10;
                temp1.val = temp1.val%10;
                temp1 = temp1.next;
            }
            temp1.val = temp1.val+carry;
            carry = temp1.val/10;
            temp1.val%=10;
        }

        if(carry!=0)
        {
            ListNode c = new ListNode(carry);
            temp1.next = c;
        }
        return l1;
    }
}
