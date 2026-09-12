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
        int begin = k-1;
        int end = n-k;
        int temp2 = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp2;
        
        ListNode dummy = new ListNode(0);
        ListNode dum = dummy;
        for(int i=0; i<n; i++){
            dum.next = new ListNode(arr[i]);
            dum = dum.next;
        }
        return dummy.next;
    }
}