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
    public void createLl(int val){
        dum.next = new ListNode(val);
        dum = dum.next;
    }
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
               createLl(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val >= x){
                createLl(temp.val);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}