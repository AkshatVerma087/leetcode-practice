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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        int n = 0;
        while(slow != null) {

            n++;
            slow = slow.next;
        }

        k = k % n;

        slow = head;
        while(k > 0) {
            fast = fast.next;
            k--;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

           System.out.println(n);

    
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;

     
        
    }
}