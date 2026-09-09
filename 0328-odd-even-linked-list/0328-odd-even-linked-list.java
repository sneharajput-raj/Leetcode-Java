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
    public void createNewLl(int x){
        dum.next = new ListNode(x);
        dum = dum.next;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;  //odd
        while(temp != null){
            createNewLl(temp.val);
            if(temp.next != null){
                temp = temp.next.next;
            }
            else break;
        }
        temp = head.next;     //even
        while(temp != null){
            createNewLl(temp.val);
            if(temp.next != null){
                temp = temp.next.next;
            }
            else break;
        }
        return dummy.next;
    }
}