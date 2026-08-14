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
    public int count(ListNode head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        int n = count(head);
        ListNode[] arr = new ListNode[n];
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            arr[i] = temp;
            i++;
            temp = temp.next;
        }
        for(int j=0; j<n-1; j=j+2){
            ListNode tem = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tem;
        }
        // ListNode dummy = new ListNode(0); 
        // ListNode res = dummy;
        // for(int k=0; k<n; k++){
        //     res.next = new ListNode(arr[k]);
        //     res = res.next;
        // }
        // return dummy.next;

        for(int k=0; k<n-1; k++){
            arr[k].next = arr[k+1];
        }
        arr[n-1].next = null;
        return arr[0];
    }
}