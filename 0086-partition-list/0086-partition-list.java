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
    public ListNode partition(ListNode head, int x) {
        ListNode Dummy1=new ListNode(-1);
        ListNode Dummy2=new ListNode(-1);
        ListNode temp=head;

        ListNode T1= Dummy1;
        ListNode T2= Dummy2;

        while(temp != null){
            if(temp.val < x){
            T1.next=temp;
            T1=T1.next;
            }
            else{
                T2.next=temp;
                T2=T2.next;
            }
            temp=temp.next;
        }
        T1.next=Dummy2.next;
        T2.next=null;
        return Dummy1.next;
    }
}