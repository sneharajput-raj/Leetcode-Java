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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        int t = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = t;

        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        for(int i=0; i<n; i++){
            dum.next = new ListNode(arr[i]);
            dum = dum.next;
        }
        return dummy.next;
    }
}