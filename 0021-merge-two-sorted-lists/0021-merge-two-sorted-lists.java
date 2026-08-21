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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp1 = list1; 
        ListNode temp2 = list2;
        while(temp1 != null){
            li.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            li.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(li);
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        for(int ele : li){
            dum.next = new ListNode(ele);
            dum = dum.next;
        }
        return dummy.next;
    }
}