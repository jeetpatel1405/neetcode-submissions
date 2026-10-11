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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        int i=0,j=arr.size()-1,fl=0;
        temp = head;
        while(temp!=null)
        {
            if(fl==0) 
            {
                temp.val = arr.get(i);
                i++;
                fl=1;
            }
            else if(fl==1)
            {
                temp.val = arr.get(j);
                j--;
                fl=0;
            }
            temp = temp.next;
        }
    }
}
