https://leetcode.com/problems/odd-even-linked-list/description/

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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(3);
        ListNode even = new ListNode(3);
        ListNode tempo = odd;
        ListNode  tempe = even;
        ListNode temp = head;
        while(temp!=null){
            tempo.next = temp;
            tempo = tempo.next;
            temp = temp.next;

            tempe.next = temp;
            if(temp!=null){
                tempe = tempe.next;
                temp = temp.next;
            }
        }
       odd = odd.next;
       even = even.next;
       tempo.next = even;
       return odd;
    }
}
