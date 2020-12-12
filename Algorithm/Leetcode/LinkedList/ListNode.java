package Leetcode.linkedList;

/**
 * @author vanguo996
 */

public class ListNode{
    int val;
    ListNode next;

    public ListNode(int x) {this.val = x;}
    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    public int getval() {
        return val;
    }
}
