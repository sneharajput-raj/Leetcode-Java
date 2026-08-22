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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);

        ListNode temp = head;
        while(temp != null){
            ListNode nextNode = temp.next;      //next node
            ListNode lastNode = dummy;          //previous node
            while(lastNode.next != null && lastNode.next.val < temp.val){
                lastNode = lastNode.next;
            }
            temp.next = lastNode.next;
            lastNode.next = temp;
            temp = nextNode;
        }
        return dummy.next;
    }
}