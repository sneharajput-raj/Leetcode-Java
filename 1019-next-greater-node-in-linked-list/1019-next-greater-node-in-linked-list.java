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
    public int nextGreater(int i , int x, int[] arr){
        for(int j=i+1; j<arr.length; j++){
            if(arr[j] > x){
                return arr[j];
            }
        }
        return 0;
    }
    public int[] nextLargerNodes(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = head.val;
            head = head.next;
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int ele = nextGreater(i, arr[i], arr);
            ans[i] = ele;
        }
        return ans;
    }
}