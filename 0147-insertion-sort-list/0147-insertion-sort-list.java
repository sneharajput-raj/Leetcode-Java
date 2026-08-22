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
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        int n = li.size();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(li.get(i) > li.get(j)){
                    int temp2 = li.get(i);
                    li.set(i , li.get(j));
                    li.set(j, temp2);
                }
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        for(int ele : li){
            dum.next = new ListNode(ele);
            dum = dum.next;
        }
        return dummy.next;
    }
}