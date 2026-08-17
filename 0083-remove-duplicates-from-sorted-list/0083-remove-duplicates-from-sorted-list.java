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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new TreeSet<>();
        while(head != null){
            set.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        for(int ele : set){
            ans.next = new ListNode(ele);
            ans = ans.next;
        }
        return dummy.next;
    }
}