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
        if(head == null || head.next == null || k==0) return head;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        k = k % len;
        if(k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        for(int i=1; i<=k; i++){
            fast = fast.next;
        }
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev != null) prev.next = null;  //break the connection so [1,2,3] separates and ends with null
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        while(slow != null){
            dum.next = slow;
            dum = dum.next;
            slow = slow.next;
        }
        dum.next = head;

        return dummy.next;
    }
}
//T.C..   O(length)
//S.C..    O(1)