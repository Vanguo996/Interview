package newCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author vanguo996
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */


public class CommonLinkedListNode {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
    * @Description 双指针法，但是当两个链表长度不相等时，
    * 注意123，134这种情况是没有公共节点的！
     * 因为节点右两部分组成，一个是数据，一个是指针，在只有数据一样的情况下，节点还是不一样
    */
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if( pHead1 == null || pHead2 == null ) {
                return null;
            }
            ListNode p1 = pHead1;
            ListNode p2 = pHead2;
            while( p1 != p2 ) {
                p1 = p1 == null ? pHead2 : p1.next;
                p2 = p2 == null ? pHead1 : p2.next;
            }
            return p1;
        }
    }

}
