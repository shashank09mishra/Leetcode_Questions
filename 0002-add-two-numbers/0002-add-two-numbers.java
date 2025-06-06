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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(-1);
       int carry=0;
       ListNode temp = dummy;

       while(l1 !=  null || l2!= null){
        int sum =carry;
        if(l1 != null){
            sum += l1.val;
        }
        if(l2 != null){
            sum += l2.val;
        }
        ListNode node = new ListNode(sum%10);
        temp.next= node;
        temp= temp.next;
        carry=sum/10;
        if(l1 !=null){
            l1=l1.next;
        }
        if(l2 != null){
            l2=l2.next;
        }
    
       } 
       if(carry !=0){
        ListNode node1 = new ListNode(carry);
        temp.next= node1;
       }
       return dummy.next;
    }
}