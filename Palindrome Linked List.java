https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode mid = middleNode(head);
         ListNode curr = mid;
        ListNode prev = null;
        ListNode Next = mid;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next; 
        }

        while(prev!=null){
            if(temp.val != prev.val){
                   return false;
               
            }else{
                 temp = temp.next;
                prev = prev.next;
            }
        }
       
     return true;
    }
     public ListNode middleNode(ListNode head) {
        ListNode s = head;
         ListNode f = head;

         while(f!=null && f.next!=null){
             s = s.next;
             f = f.next.next;
         }
         return s;
    }
}
