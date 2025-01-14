/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            System.out.println(head.val);
            if(head.val == -9999999){
                return true;
            }
            head.val = -9999999;
            head = head.next;
        }

        return false;
    }
}