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
    ListNode dummy = new ListNode(0);
    ListNode dum = dummy;
    public void createLL(int x){
        dum.next = new ListNode(x);
        dum = dum.next;
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        // if(head == null || head.next == null) return head;
        while(temp != null){
            if(temp.val != val){
                createLL(temp.val);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}