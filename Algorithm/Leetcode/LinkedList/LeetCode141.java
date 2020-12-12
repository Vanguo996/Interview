package Leetcode.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author vanguo996
 */


public class LeetCode141 {
    /**
    * @Description 检测链表是否有环，pos表示链表尾部连接到链表的第几个节点，
    * pos = -1 表示没有环
    *
    *
    */
    /*
        思路一：
        可以使用cur表示尾部，当cur到达尾部，head开始移动，如果两者相等就有环
        可是如何使得cur到达尾部？现在链表是有环的。也就是说如何记录？

        这里有个重要思路：检查一个节点是否被访问过，也就是要存储之前的数据，我们可以用哈希表。HashSet
        集合中的set：HashSet不关心顺序，速度最快；TreeSet顺序存储；LinkedHashSet插入顺序存储。

        6.17,
        HashSet，不重复元素。常数时间查找是否有相同元素。

     */


//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> node = new HashSet<>();
//        while(head != null) {
//            if (node.contains(head)){
//                return true;
//            } else {
//                node.add(head);
//            }
//            head = head.next;
//        }
//        return false;
//
//    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        //确定一个存放链表对象的集合。

        while(head.next != null) {
            if(set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }


    /*
    思路二：
    双指针法：
    一个快指针，一次走二步；一个慢指针，一次走一步

    链表有环，则两指针相遇
    链表无环，则快指针为空。

     */


    public boolean hasCycle2(ListNode head) {
        //这里判断注意前后顺序，head.next在前会报空指针异常
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head.next;

        while (fast != slow) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null) {
                return false;
            }

        }
        return true;

    }


}
