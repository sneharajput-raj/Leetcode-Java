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
    public boolean isPalindrome(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = head.val;
            head = head.next;
        }
        int low = 0;
        int high = n-1;
        while(low <= high){
            if(arr[low] != arr[high]) return false;
            low++;
            high--;
        }
        return true;
    }
}